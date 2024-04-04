package Entities;

import java.util.LinkedList;
import java.util.Scanner;
public class ListaDeAlunos {
    ListaEncadeada listaEncadeada = new ListaEncadeada();
    LinkedList<Aluno> listaOrdenada = new LinkedList<Aluno>();

    public void menuListaAlunos() {
        boolean opcao = false;

        Scanner scan = new Scanner(System.in);

        do {            
            System.out.println("O que você deseja? ");
            System.out.println("1- Incluir aluno no início da lista\n" +
                               "2- Incluir aluno no final da lista\n" +
                               "3- Ordenar alunos\n" +
                               "4- Remover aluno do final da lista\n" +
                               "5- Quantidade de alunos da lista\n" +
                               "6- Aluno por posição");
            int escolha = Integer.parseInt(scan.nextLine());

            switch (escolha) {
                case 1:
                    Aluno newAluno = Aluno.cadastraAluno();
                    listaEncadeada.incluirNoInicio(newAluno);
                    System.out.println("Aluno inserido com sucesso no início da lista");
                    // Turma adicionaNaTurma(inicio);
                    opcao = true;
                    break;
                case 2:
                    newAluno = Aluno.cadastraAluno();
                    listaEncadeada.incluirNoFIm(newAluno);
                    System.out.println("Aluno inserido com sucesso no final da lista");
                    opcao = true;
                    break;
                case 3:
                    listaEncadeada.ordenar();
                    opcao = true;
                    break;
                case 4:
                    Aluno removido = listaEncadeada.removerDoFim();
                    System.out.println(removido);
                    opcao = true;
                    break;
                case 5:
                    int tamanho = listaEncadeada.tamanho();
                    System.out.println("Tamanho total da lista: " + tamanho);
                    opcao = true;
                    break;
                case 6:
                    System.out.println("Informe a posição que deseja:");
                    int index = Integer.parseInt(scan.nextLine());
                    Aluno posicaoAluno = listaEncadeada.get(index);

                    if (posicaoAluno != null) {
                        System.out.println("Aluno na posição solitada");
                        System.out.println(posicaoAluno);
                    }
                    
                    opcao = true;
                    break;
                default:
                    break;
            }

        } while (!opcao);

    }

    public void menuMatricularAluno(Turma turma) {
        boolean opcao = false;

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o código da Turma");
        turma.mostrarPossiveisTurmas();
        int turmaEscolhida = Integer.parseInt(scan.nextLine());
        System.out.println();
        System.out.println("Informe o nome do aluno");
        String alunoEscolhido = scan.nextLine();
        
        Turma turmaEncontrada = turma.procuraTurma(turmaEscolhida);
        Aluno alunoEncontrado = listaEncadeada.getPorNome(alunoEscolhido);

        Turma.adicionarAlunoTurmaFinal(alunoEncontrado, turmaEncontrada);
    }

    class Node {
        Aluno aluno;
        Node next;

        Node(Aluno aluno) {
            this.aluno = aluno;
            this.next = null;
        }
    }

    public class ListaEncadeada {
        ListaDeAlunos.Node head;

        public void incluirNoInicio(Aluno aluno) {
            ListaDeAlunos.Node novoNode = new ListaDeAlunos.Node(aluno);
            novoNode.next = head;
            head = novoNode;
        }

        public void incluirNoFIm(Aluno aluno) {
            Node novoNode = new Node(aluno);

            if (head == null) {
                head = novoNode;
            } else {
                Node ultimo = head;
                while (ultimo.next != null) {
                    ultimo = ultimo.next;
                }
                ultimo.next = novoNode;
            }
        }

        public void ordenar() {
            // Se a lista estiver vazia ou tiver apenas um elemento, já está ordenada
            if (head == null || head.next == null) {
                printList(head);
                return;
            }

            // Cria uma nova lista ordenada
            Node novaLista = null;

            // Percorre a lista original
            while (head != null) {
                // Guarda o nó atual e avança na lista original
                Node atual = head;
                head = head.next;

                // Se a nova lista estiver vazia ou o aluno atual tiver um nome que vem antes do primeiro nome na nova lista
                if (novaLista == null || atual.aluno.Nome.compareTo(novaLista.aluno.Nome) < 0) {
                    // Insere o aluno no início da lista
                    atual.next = novaLista;
                    novaLista = atual;
                } else {
                    // Localiza o nó antes do ponto de inserção na nova lista
                    Node antes = novaLista;
                    while (antes.next != null && antes.next.aluno.Nome.compareTo(atual.aluno.Nome) < 0) {
                        antes = antes.next;
                    }

                    // Insere o aluno atual na nova lista
                    atual.next = antes.next;
                    antes.next = atual;
                }
            }
            // Atualiza a cabeça da lista para a nova lista ordenada
            head = novaLista;

            printList(novaLista);
        }

        public void printList(Node list)
        {
            Node current = list;

            System.out.println("Lista Ordenada de Alunos");
            int i = 1;
            while (current != null) {
                System.out.print(i);
                System.out.print(" ");
                System.out.println(current.aluno);

                i++;
                current = current.next;
            }
        }

        public Aluno removerDoFim() {
            // Se a lista estiver vazia não tem o que remover
            if (head == null) {
                return null;
            }

            // Se a lista tiver apenas um elemento, remove a cabeça
            if (head.next == null) {
                Aluno alunoRemovido = head.aluno;
                head = null;
                return alunoRemovido;
            }

            //Localiza o penúltimo nó
            Node penultimo = head;
            while (penultimo.next.next != null) {
                penultimo = penultimo.next;
            }

            // Remove o último nó e retorna o aluno
            Aluno alunoRemovido = penultimo.next.aluno;
            penultimo.next = null;
            return alunoRemovido;
        }

        public int tamanho() {
            int tamanho = 0;
            Node atual = head;

            while (atual != null) {
                tamanho++;
                atual = atual.next;
            }

            return tamanho;
        }

        public Aluno get(int index) {
            if (head == null) {
                System.out.println("A lista não contêm nenhum aluno!");
                return null;
            }

            Node atual = head;
            int contador = 0;

            // Percorre a lista até encontrar o nó na posição desejada
            while (atual != null) {
                if (contador == index) {
                    return atual.aluno;
                }
                contador++;
                atual = atual.next;
            }

            // Se a posição for maior que o tamanho da lista, retorna null
            System.out.println("Posição informada é maior que o tamanho da lista");
            return null;
        }

        public Aluno getPorNome(String nome) {
            if (head == null) {
                System.out.println("A lista não contêm nenhum aluno!");
                return null;
            }

            Node atual = head;

            // Percorre a lista até encontrar o nó na posição desejada
            while (atual != null) {
                if (atual.aluno.Nome.equals(nome)) {
                    return atual.aluno;
                }
                atual = atual.next;
            }

            // Se a posição for maior que o tamanho da lista, retorna null
            System.out.println("Aluno não encontrado");
            return null;
        }
    }
}
