package tests;

import models.Funcionario;
import models.Gerente;
import models.Vendedor;

public class Main {
    public static void main(String[] args) {

        Funcionario func = new Funcionario();
        func.setNome("Eliane");
        func.setSalario(1000);
        double bonificacao = func.calculaBonificacao();
        System.out.println("models.Funcionario" + func.getNome() +
                "\nSalário Bruto: " + func.getSalario() +
                "\nBonificação: " + bonificacao +
                "\nSalário Liquido: + " + (func.getSalario() + bonificacao));

        Gerente gerente = new Gerente();
        gerente.setNome("Rafael");
        gerente.setSalario(1000);
        gerente.setGratificacao(1000);
        double gerentBonificacao = gerente.calculaBonificacao();
        System.out.println("models.Gerente" + gerente.getNome() +
                "\nSalário Bruto: " + gerente.getSalario() +
                "\nGratificação do cargo: " + gerente.getGratificacao() +
                "\nBonificação: " + gerentBonificacao +
                "\nSalário Liquido: + " + (gerente.getSalario() + gerentBonificacao + gerente.getGratificacao()));

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Ana");
        vendedor.setSalario(1000);
        double salarioComComissao = vendedor.calculaComissao(20000);
        double vendBonificacao = vendedor.calculaBonificacao();
        System.out.println("models.Vendedor(a)" + vendedor.getNome() +
                "\nSalário Bruto: " + vendedor.getSalario() +
                "\nComissão: " + vendedor.getComissao() +
                "\nBonificação: " + vendBonificacao +
                "\nSalário Liquido: + " + (salarioComComissao +vendBonificacao)
        );
    }
}