package Entities;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Aluno {
    public String Nome;
    public String CPF;
    public String Endereco;
    public LocalDate DataDeNascimento;
    public int Idade;
    public String CodigoTurma;
    public ArrayList<Aluno> alunosCadatrados = new ArrayList<Aluno>();

    public Aluno(String nome, String CPF, String endereco, LocalDate dataDeNascimento) {
        Nome = nome;
        this.CPF = CPF;
        Endereco = endereco;
        DataDeNascimento = dataDeNascimento;
        Idade = ObterIdade(dataDeNascimento);
    }

    public Aluno() {
        // sobrecarga
    }

    public Aluno cadastraAluno() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Nome do Aluno:");
        String nome = scan.nextLine();

        System.out.println("CPF do Aluno: (Apenas números)");
        String cpf = scan.nextLine();

        System.out.println("Endereço do Aluno:");
        String endereco = scan.nextLine();

        System.out.println("Data de Nascimento do Aluno: Formato(AAAA-MM-DD)");
        LocalDate nascimento = LocalDate.parse(scan.nextLine());

        Aluno aluno = new Aluno(nome, cpf, endereco, nascimento);
        alunosCadatrados.add(aluno);
        return aluno;
    }

    public int ObterIdade(LocalDate dataNascimento) {
        LocalDate hoje = LocalDate.now();
        return Period.between(dataNascimento, hoje).getYears();
    }

    public void exibirLista() {
        Collections.sort(alunosCadatrados, Comparator.comparing(Aluno::getNome));
        for (Aluno listaAluno : alunosCadatrados) {
            System.out.println(listaAluno.toString());
        }
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

    public LocalDate getDataDeNascimento() {
        return DataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        DataDeNascimento = dataDeNascimento;
    }

    public String getCodigoTurma() {
        return CodigoTurma;
    }

    public void setCodigoTurma(String codigoTurma) {
        CodigoTurma = codigoTurma;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + Nome + " - Idade: " + Idade + ";";
    }
}
