package View;

import java.util.Scanner;

public class MenuPrincipal {
    
    Scanner scan = new Scanner(System.in);

    public int MenuDeOpcoes() {
        System.out.println("Menu Principal");
        System.out.println("1 - Cadastrar turma"); // OK
        System.out.println("2 - Cadastrar aluno");
        System.out.println("3 - Cadastrar aluno em uma turma");
        System.out.println("4 - Listar aluno em ordem alfabética");
        System.out.println("5 - Listar turmas cadastradas"); // OK
        System.out.println("6 - Mostrar alunos cadastrados em uma turmas e fora da etapa");
        System.out.println("0 - Sair");
        int opcao = scan.nextInt();
        return opcao;
    }
}


