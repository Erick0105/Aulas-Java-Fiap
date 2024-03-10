import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem Vindos");

        String nomeAluno, telefone;
        int idade;

        System.out.println("Digite seu nome:");
        nomeAluno = leitor.nextLine();
        System.out.println("DIgite seu telefone para contato");
        telefone = leitor.nextLine();
        System.out.println();
        System.out.println("Seja bem vindo a Fiap " + nomeAluno);
    }
}
