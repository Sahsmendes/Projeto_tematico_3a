package View;

import Entities.Turma;
import Helpers.Etapas;

import java.util.Scanner;

public class InterfaceDeUsuario {

    public void mostrarMenuPrincipal() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("1 - Cadastrar Turma");
        System.out.println("2 - Cadastrar Aluno");
        System.out.println("3 - ");
        System.out.println("0 - Sair");

        int opcao = entrada.nextInt();

        while (opcao != 0) {
            switch (opcao) {
                case 1: // Cadastro de turma
                    int tipo = -1;
                    System.out.println("Código da turma:");
                    String codigo = entrada.nextLine();
                    System.out.println("Defina a Etapa de ensino:");
                    System.out.println("1 - Infantil");
                    System.out.println("2 - Fundamental Inicial");
                    System.out.println("3 - Funadmental Final");
                    System.out.println("4 - Médio");
                    tipo = entrada.nextInt();

                    while (tipo < 0 || tipo > 4){
                        System.out.println("Valor inválido, favor digitar o valor correto");
                        System.out.println();
                        System.out.println("Defina a Etapa de ensino:");
                        System.out.println("1 - Infantil");
                        System.out.println("2 - Fundamental Inicial");
                        System.out.println("3 - Funadmental Final");
                        System.out.println("4 - Médio");
                        tipo = entrada.nextInt();
                    }

                    Etapas etapa = Etapas.values()[tipo];
                    String nomeEtapa = etapa.name();

                    System.out.println("Ano");
                    int ano = entrada.nextInt();
                    System.out.println("Limite de Vagas");
                    int vagas = entrada.nextInt();
                    System.out.println("Numero de Matriculados");
                    int matriculas = entrada.nextInt();

                    Turma turma = new Turma(codigo, nomeEtapa, ano, vagas, matriculas);
                    System.out.println("Turma Adicionada!");
                    break;
                case 2:
                    break;

                case 0:
                    System.out.println("Finalizando programa...");
                    System.exit(0);
            }
            System.out.println();
            System.out.println("1 - Cadastrar Turma");
            System.out.println("2 - Cadastrar Aluno");
            System.out.println("3 - ");
            System.out.println("0 - Sair");
            opcao = entrada.nextInt();
        }
        entrada.close();
    }
}
