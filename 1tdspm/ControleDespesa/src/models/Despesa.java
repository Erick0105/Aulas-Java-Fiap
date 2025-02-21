package models;

import java.util.Scanner;
public abstract class Despesa {
    Scanner leitor = new Scanner(System.in);

    //ATRIBUTOS
    private String descricao;
    private double valorTotal;


    //GETTERS E SETTERS
    public String getDescricao() {
        return descricao;
    }
    public double getValorTotal() {
        return valorTotal;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }


    //METÓDOS
    public void cadastrarDespesa() {
        System.out.println("------------------------------------------------\nQual é a descrição da Despesa?\n=>");
        this.descricao = leitor.nextLine();
        this.valorTotal = 0;

    }

    public abstract void calcularDespesa();

    public abstract void listaDespesa();
}
