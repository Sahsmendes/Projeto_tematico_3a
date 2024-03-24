package Entities;

import Helpers.Etapas;

import java.util.List;

public class Turma {
    public String CodigoDaTurma;
    public String Etapa;
    public int Ano;
    public int LimiteDeVagas;
    public int Matriculados;

    public Turma(String codigoDaTurma, String etapa, int ano, int limiteDeVagas, int matriculados) {
        CodigoDaTurma = codigoDaTurma;
        Etapa = etapa;
        Ano = ano;
        LimiteDeVagas = limiteDeVagas;
        Matriculados = matriculados;
    }

    public String getCodigoDaTurma() {
        return CodigoDaTurma;
    }

    public void setCodigoDaTurma(String codigoDaTurma) {
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
        return '\n' + "CodigoDaTurma = '" + CodigoDaTurma + '\n' +
               "Etapa = " + Etapa + '\n' +
               "Ano = " + Ano + '\n' +
               "LimiteDeVagas = " + LimiteDeVagas + '\n' +
               "Matriculados = " + Matriculados + '\n';
    }
}
