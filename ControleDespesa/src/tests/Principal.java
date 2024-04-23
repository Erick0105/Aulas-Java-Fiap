package tests;

import models.Alimentacao;
import models.Diaria;
import models.Transporte;
import models.GerenciadorDespesas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {


        //OBJETOS INSTANCIADOS
        Scanner scanner= new Scanner(System.in);


        //FUNCIONALIDADE
        String menuInicial = "---------------MENU---------------" +
                "\n[1] - Alimentação" +
                "\n[2] - Transporte" +
                "\n[3] - Diaria" +
                "\n[4] - Apresenta analise de despesas" +
                "\n[0] - Sair" +
                "\n----------------------------------";
        String menuSecundario = "---------------MENU---------------" +
                "\n[1] - Cadastrar despesa" +
                "\n[2] - Calcular despesa" +
                "\n[3] - Apresentar despesa" +
                "\n[4] - Incluir despesa para analise" +
                "\n[0] - Sair" +
                "\n----------------------------------";

        System.out.println(menuInicial);
        System.out.println("Digite a opção desejada:\n=> ");
        int opcao = scanner.nextInt();

        if (opcao == 0){
            System.out.println("Até mais");
        }else {
            if (opcao == 1){
                Alimentacao refeicoes = new Alimentacao();
            } else if (opcao == 2) {
                Transporte veiculos = new Transporte();
            } else if (opcao == 3) {
                Diaria diarias = new Diaria();
            } else if (opcao == 4) {
                GerenciadorDespesas gerenciador = new GerenciadorDespesas();
            }
        }

    }
}