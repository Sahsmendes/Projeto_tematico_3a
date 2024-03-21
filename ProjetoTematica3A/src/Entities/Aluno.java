package Entities;

import java.util.Date;

public class Aluno extends Turma{
    public String Nome;
    public String CPF;
    public String Endereco;
    public Date DataDeNascimento;

    public Aluno(String codigoDaTurma, String etapa, int ano, int limiteDeVagas, int matriculados, String nome, String CPF, String endereco, Date dataDeNascimento) {
        super(codigoDaTurma, etapa, ano, limiteDeVagas, matriculados);
        Nome = nome;
        this.CPF = CPF;
        Endereco = endereco;
        DataDeNascimento = dataDeNascimento;
    }
}
