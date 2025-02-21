package models;

import models.Funcionario;

public class Gerente extends Funcionario {

    //--ATRIBUTOS
    private double gratificacao;


    //--GETTERS E SETTERS
    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }

    //--MÉTODOS
    @Override
    public double calculaBonificacao() {
        return super.calculaBonificacao() + 1000;
    }
}
