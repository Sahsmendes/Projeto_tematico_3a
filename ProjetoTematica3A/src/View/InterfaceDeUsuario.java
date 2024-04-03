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
                case 2: // Listar turmas cadastradas
                    System.out.println("Lista de turmas:");
                    System.out.println(turma.turmasCadastradas.toString());
                    break;
                case 3: // Cadastro de alunos
                    lista.menuListaAlunos();
                    break;
                case 4: // Cadastro de alunos em uma turma
                    lista.menuListaAlunos();
                    break;
                case 5: // Listar alunos em ordem alfábetica
                    aluno.exibirLista();
                    break;
                case 6: // Mostrar alunos cadastrados em uma turmas e fora da etapa
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
