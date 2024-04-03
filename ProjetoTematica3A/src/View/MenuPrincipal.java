package View;

import java.util.Scanner;

public class MenuPrincipal {
    
    Scanner scan = new Scanner(System.in);

    public int MenuDeOpcoes() {
        System.out.println("Menu Principal");
        System.out.println("1 - Cadastro de turmas"); // ok
        System.out.println("2 - Listar turmas cadastradas"); // ok
        System.out.println("3 - Cadastro de alunos"); // ok
        System.out.println("4 - Cadastrar de alunos em uma turma");
        System.out.println("5 - Listar alunos em ordem alfábetica");
        System.out.println("6 - Mostrar alunos cadastrados em uma turmas e fora da etapa");
        System.out.println("0 - Sair");
        int opcao = scan.nextInt();
        return opcao;
    }
}