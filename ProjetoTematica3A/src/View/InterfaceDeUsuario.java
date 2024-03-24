package View;

import Entities.Aluno;
import Entities.Turma;
import Helpers.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class InterfaceDeUsuario {

    private ArrayList<Turma> turmasCadastradas = new ArrayList<Turma>();
    private ArrayList<Aluno> alunosCadatrados = new ArrayList<Aluno>();

    public void mostrarMenuPrincipal() {
        EtapaDeEnsino etapa = new EtapaDeEnsino();
        ObterIdade obterIdade = new ObterIdade();
        MenuPrincipal menu = new MenuPrincipal();
        Scanner scan = new Scanner(System.in);

        int opcao = menu.MenuDeOpcoes();

        while (opcao != 0) {
            switch (opcao) {
                case 1: // Cadastro de turma
                    System.out.println("Código da turma:");
                    String codigo = scan.next();

                    int tipo = etapa.Etapas();

                    while (tipo < 0 || tipo > 4){
                        System.out.println("Valor inválido, favor digitar o valor correto");
                        System.out.println();
                        tipo =  etapa.Etapas();
                    }
                    Etapas etapas = Etapas.values()[tipo];
                    String nomeEtapa = etapas.name();

                    System.out.println("Ano");
                    int ano = scan.nextInt();

                    System.out.println("Limite de Vagas");
                    int vagas = scan.nextInt();

                    System.out.println("Numero de Matriculados");
                    int matriculas = scan.nextInt();

                    Turma turma = new Turma(codigo, nomeEtapa, ano, vagas, matriculas);
                    turmasCadastradas.add(turma);

                    System.out.println("Turma criada com sucesso!");
                    break;
                case 2: // Cadastro de Aluno
                    System.out.println("Nome do Aluno:");
                    String nome = scan.next();

                    System.out.println("CPF do Aluno: (Apenas números)");
                    String cpf = scan.next();

                    System.out.println("Endereço do Aluno:");
                    String endereco = scan.next();

                    System.out.println("Data de Nascimento do Aluno: Formato(DD/MM/AAAA)");
                    String nascimento = scan.next();
                    int idade = obterIdade.ObterIdade(nascimento);

                    Aluno aluno = new Aluno(nome, cpf, endereco, nascimento, idade);
                    alunosCadatrados.add(aluno);

                    System.out.println("Aluno cadastrado com sucesso!");
                    break;
                case 3: // Cadastrar aluno em uma turma
                    break;
                case 4: // Listar alunos em ordem alfabética
                    Collections.sort(alunosCadatrados, Comparator.comparing(Aluno::getNome));
                    for (Aluno listaAluno : alunosCadatrados){
                        System.out.println(listaAluno.getNome());
                    }
                    break;
                case 5: // Listar turmas cadastradas
                    System.out.println(turmasCadastradas.toString());
                    break;
                case 6: // Listar alunos matriculados em uma turma
                    break;
            }

            System.out.println();
            opcao = menu.MenuDeOpcoes();
        }
        System.out.println("Finalizando programa...");
        scan.close();
        System.exit(0);
    }
}
