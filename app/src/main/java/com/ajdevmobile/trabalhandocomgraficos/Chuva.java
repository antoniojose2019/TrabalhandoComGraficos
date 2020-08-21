package com.ajdevmobile.trabalhandocomgraficos;

public class Chuva {

    private int dia;
    private int mes;
    private int ano;
    private int chuvamm;


    public Chuva() {
    }


    public Chuva(int dia, int mes, int ano, int chuvamm) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.chuvamm = chuvamm;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getChuvamm() {
        return chuvamm;
    }

    public void setChuvamm(int chuvamm) {
        this.chuvamm = chuvamm;
    }
}
