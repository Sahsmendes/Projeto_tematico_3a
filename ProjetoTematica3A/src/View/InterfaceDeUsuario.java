package View;

import Entities.ListaDeAlunos;
import Entities.Turma;

public class InterfaceDeUsuario {

    Turma turma = new Turma();
    ListaDeAlunos lista = new ListaDeAlunos();

    public void mostrarMenuPrincipal() {
        int opcao = MenuPrincipal.menuDeOpcoes();

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
                    lista.menuMatricularAluno(turma);
                    break;
                case 5: // Mostrar alunos cadastrados em uma turmas e fora da etapa
                    System.out.println("Informe o código da Turma");
                    turma.mostrarPossiveisTurmas();
                    break;
            }

            System.out.println();
            opcao = MenuPrincipal.menuDeOpcoes();
        }
        System.out.println("Finalizando programa...");
        System.exit(0);
    }
}
