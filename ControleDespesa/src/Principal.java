import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        //OBJETOS INSTANCIADOS
        Alimentacao refeicoes = new Alimentacao();
        Transporte veiculos = new Transporte();
        Diaria diarias = new Diaria();
        GerenciadorDespesas gerenciador = new GerenciadorDespesas();

        //FUNCIONALIDADE
        System.out.println("---------------MENU---------------" +
                "\n[1] - Alimentação" +
                "\n[2] - Transporte" +
                "\n[3] - Diaria" +
                "\n[4] - Apresenta analise de despesas" +
                "\n[0] - Sair" +
                "\n----------------------------------");


        System.out.println("---------------MENU---------------" +
                "\n[1] - Cadastrar despesa" +
                "\n[2] - Calcular despesa" +
                "\n[3] - Apresentar despesa" +
                "\n[4] - Incluir despesa para analise" +
                "\n[0] - Sair" +
                "\n----------------------------------");

    }
}