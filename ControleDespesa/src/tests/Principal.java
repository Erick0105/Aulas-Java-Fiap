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
        String mensagemSaida = "Até mais\nPrograma Finalizado";

        System.out.println(menuInicial);
        System.out.println("Digite a opção desejada:\n=> ");
        int opcao1 = scanner.nextInt();

        if (opcao1 == 0){
            System.out.println(mensagemSaida);

        }else {
            if (opcao1 == 1){
                Alimentacao refeicoes = new Alimentacao();

                System.out.println(menuSecundario);
                System.out.println("O que o senhor(a) deseja fazer na parte de Alimentação?\n=> ");
                int opcao2 = scanner.nextInt();

                if (opcao2 == 0) {
                    System.out.println(mensagemSaida);
                } else {
                    if (opcao2 == 1){
                        refeicoes.cadastrarDespesa();
                    } else if (opcao2 == 2) {
                        refeicoes.calcularDespesa();
                    } else if (opcao2 == 3) {
                        refeicoes.listaDespesa();
                    } else if (opcao2 == 4){
                        System.out.println("Parte do gerenciador, ela vai ensinar ainda");
                    }
                }

            } else if (opcao1 == 2) {
                Transporte veiculos = new Transporte();

                System.out.println(menuSecundario);
                System.out.println("O que o senhor(a) deseja fazer na parte de Transporte?\n=> ");
                int opcao2 = scanner.nextInt();

                if (opcao2 == 0) {
                    System.out.println(mensagemSaida);
                } else {
                    if (opcao2 == 1){
                        veiculos.cadastrarDespesa();
                    } else if (opcao2 == 2) {
                        veiculos.calcularDespesa();
                    } else if (opcao2 == 3) {
                        veiculos.listaDespesa();
                    } else if (opcao2 == 4){
                        System.out.println("Parte do gerenciador, ela vai ensinar ainda");
                    }
                }
            } else if (opcao1 == 3) {
                Diaria diarias = new Diaria();

                System.out.println(menuSecundario);
                System.out.println("O que o senhor(a) deseja fazer na parte de Diaria?\n=> ");
                int opcao2 = scanner.nextInt();

                if (opcao2 == 0) {
                    System.out.println(mensagemSaida);
                } else {
                    if (opcao2 == 1){
                        diarias.cadastrarDespesa();
                    } else if (opcao2 == 2) {
                        diarias.calcularDespesa();
                    } else if (opcao2 == 3) {
                        diarias.listaDespesa();
                    } else if (opcao2 == 4){
                        System.out.println("Parte do gerenciador, ela vai ensinar ainda");
                    }
                }
            } else if (opcao1 == 4) {
                GerenciadorDespesas gerenciador = new GerenciadorDespesas();
            }
        }

    }
}