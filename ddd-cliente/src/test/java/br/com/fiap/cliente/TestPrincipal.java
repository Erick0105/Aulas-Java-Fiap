package br.com.fiap.cliente;

import java.util.Scanner;

public class TestPrincipal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("-----------OPÇÕES------------" +
                "\n[0] - Sair;" +
                "\n[1] - Cadastrar;" +
                "\n[2] - Listar;" +
                "\n[3] - Pesquisar por Cep." +
                "\n\nDigite o número correspondente a opção desejada");
        int opCrud = leitor.nextInt();

        switch (opCrud){
            case 1:
            case 2:
            case 3:
            default:
        }
    }
}
