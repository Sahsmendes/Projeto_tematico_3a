package Entities;

import java.util.Scanner;

public class ListaDeAlunos {

    Scanner scan = new Scanner(System.in);

    public void menuListaAlunos() {
        boolean opcao = false;
        String cpf = null;
        int codigoTurma = 0;

        do {
            System.out.println("O que você deseja? ");
            System.out.println("1- Incluir aluno no início da turma\n" +
                               "2- Incluir aluno no final da turma\n" +
                               "3- Ordenar alunos\n" +
                               "4- Remover aluno do final da lista\n" +
                               "5- Quantidade de alunos da lista\n" +
                               "6- Aluno por posição");
            int escolha = Integer.parseInt(scan.nextLine());

            switch (escolha) {
                case 1:
                    System.out.println("Digite o cpf do aluno: ");
                    cpf = scan.nextLine();
                    System.out.println("Digite a turma que o aluno será matriculado: ");
                    codigoTurma = Integer.parseInt(scan.nextLine());
                    adicionaAlunoTurmaComeco(null, null);
                    break;
                case 2:
                    System.out.println("Digite o cpf do aluno: ");
                    cpf = scan.nextLine();
                    System.out.println("Digite a turma que o aluno será matriculado: ");
                    codigoTurma = Integer.parseInt(scan.nextLine());
                    adicionarAlunoTurmaFinal(null, null);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;
            }

        } while (!opcao);
    }

    public void adicionaAlunoTurmaComeco(Aluno aluno, Turma turma) {
        if (turma.LimiteDeVagas > turma.Matriculados) {
            turma.getAlunosMatriculados().addFirst(aluno);
            turma.setMatriculados(turma.getMatriculados() + 1);
        } else {
            System.out.println("Não há mais vagas na turma " + turma );
        }
    }

    public void adicionarAlunoTurmaFinal(Aluno aluno, Turma turma) {
        if (turma.LimiteDeVagas > turma.Matriculados) {
            turma.getAlunosMatriculados().add(aluno);
            turma.setMatriculados(turma.getMatriculados() + 1);
        } else {
            System.out.println("Não há mais vagas na turma " + turma );
        }
    }

}
