package Entities;

import java.util.*;

public class Turma {
    public int CodigoDaTurma;
    public String Etapa;
    public int Ano;
    public int LimiteDeVagas;
    public int Matriculados;
    public ArrayList<Aluno> alunosMatriculados;

    public List<Turma> turmasCadastradas = new ArrayList<>();

    Scanner scan = new Scanner(System.in);

    public Turma(int codigoDaTurma, String etapa, int ano, int limiteDeVagas, int matriculados) {
        CodigoDaTurma = codigoDaTurma;
        Etapa = etapa;
        Ano = ano;
        LimiteDeVagas = limiteDeVagas;
        Matriculados = matriculados;
        alunosMatriculados = new ArrayList<>();
    }

    public Turma() {
        // Sobrecarga
    }

    public void cadastraTurma() {
        while (true) {
            try {
                System.out.println("Código da turma:");
                int codigo = Integer.parseInt(scan.nextLine());
                boolean opcao = false;
                String nomeEtapa = null;
                int ano;

                do {
                    System.out.println("Selecione a etapa da turma: ");
                    System.out.println("1- Infantil \n2- Fundamental Inicial \n3- Fundamental Final \n4- Ensino Médio");
                    String etapa = scan.nextLine();
                    switch (etapa) {
                        case "1":
                            nomeEtapa = "Infantil";
                            opcao = true;
                            break;
                        case "2":
                            nomeEtapa = "Fundamental Inicial";
                            opcao = true;
                            break;
                        case "3":
                            nomeEtapa = "Fundamental Final";
                            opcao = true;
                            break;
                        case "4":
                            nomeEtapa = "Ensino médio";
                            opcao = true;
                            break;
                        default:
                            System.out.println("Valor inválido.");
                            break;
                    }
                } while (!opcao);

                System.out.println("Ano");
                ano = Integer.parseInt(scan.nextLine());

                System.out.println("Limite de Vagas");
                int vagas = Integer.parseInt(scan.nextLine());

                System.out.println("Número de Matriculados");
                int matriculas = Integer.parseInt(scan.nextLine());

                while (matriculas > vagas) {
                    System.out.println("Número de matrículas maior que o número de vagas. \nDigite novamente: ");
                    matriculas = Integer.parseInt(scan.nextLine());
                }

                Turma turma = new Turma(codigo, nomeEtapa, ano, vagas, matriculas);
                turmasCadastradas.add(turma);

                System.out.println("Turma " + nomeEtapa +" criada com sucesso!");
                break;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um valor válido para o cadastro das turmas.");
            }
        }
    }

    public int getCodigoDaTurma() {
        return CodigoDaTurma;
    }

    public void adicionarAluno(Aluno aluno) {
        alunosMatriculados.add(aluno);

    }

    public ArrayList<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(ArrayList<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }


    public void setCodigoDaTurma(int codigoDaTurma) {
        CodigoDaTurma = codigoDaTurma;
    }

    public String getEtapa() {
        return Etapa;
    }

    public void setEtapa(String etapa) {
        Etapa = etapa;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int ano) {
        Ano = ano;
    }

    public int getLimiteDeVagas() {
        return LimiteDeVagas;
    }

    public void setLimiteDeVagas(int limiteDeVagas) {
        LimiteDeVagas = limiteDeVagas;
    }

    public int getMatriculados() {
        return Matriculados;
    }

    public void setMatriculados(int matriculados) {
        Matriculados = matriculados;
    }

    @Override
    public String toString() {
        return '\n' + "CodigoDaTurma: " + CodigoDaTurma + " - Etapa: " + Etapa + " - Ano: " + Ano + " - LimiteDeVagas: " + LimiteDeVagas + " - Matriculados: " + Matriculados ;
    }
}
