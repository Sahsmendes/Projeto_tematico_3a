package Entities;

public class Aluno{
    public String Nome;
    public String CPF;
    public String Endereco;
    public String DataDeNascimento;
    public int Idade;
    public String CodigoTurma;

    public Aluno(String nome, String CPF, String endereco, String dataDeNascimento, int idade) {
        Nome = nome;
        this.CPF = CPF;
        Endereco = endereco;
        DataDeNascimento = dataDeNascimento;
        Idade = idade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getDataDeNascimento() {
        return DataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        DataDeNascimento = dataDeNascimento;
    }

    public String getCodigoTurma() {
        return CodigoTurma;
    }

    public void setCodigoTurma(String codigoTurma) {
        CodigoTurma = codigoTurma;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    @Override
    public String toString() {
        return "Aluno{" +
               "Nome=" + Nome + '\'' +
               ", Idade=" + Idade + ";" + '\n';
    }
}
