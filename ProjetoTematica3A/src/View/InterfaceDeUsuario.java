package View;

import Entities.Aluno;
import Entities.ListaDeAlunos;
import Entities.Turma;

import java.util.*;

public class InterfaceDeUsuario {

    Aluno aluno = new Aluno();
    Turma turma = new Turma();
    ListaDeAlunos lista = new ListaDeAlunos();

    public void mostrarMenuPrincipal() {
        MenuPrincipal menu = new MenuPrincipal();
        Scanner scan = new Scanner(System.in);

        int opcao = menu.MenuDeOpcoes();

        while (opcao != 0) {
            switch (opcao) {
                case 1: // Cadastro de turma
                    turma.cadastraTurma();
                    break;
                case 2: // Cadastro de Aluno
                    aluno.cadastraAluno();
                    break;
                case 3: // Cadastrar aluno em uma turma
                    lista.menuListaAlunos();
                    break;
                case 4: // Listar alunos em ordem alfabética
                    System.out.println("Lista de alunos:");
                    aluno.listaAlunos();
                    break;
                case 5: // Listar turmas cadastradas
                    System.out.println("Lista de turmas:");
                    System.out.println(turma.turmasCadastradas.toString());
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
