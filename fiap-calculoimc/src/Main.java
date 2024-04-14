import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        double peso = leitor.nextDouble();
        System.out.println("Digite sua altura");
        double altura = leitor.nextDouble();

        Calculo calculo = new Calculo(peso,altura);
        System.out.println(calculo.exibirMensagem());

        System.out.println("Seu sexo é Masculino ou Feminino? ");
        String sexo = leitor.next();
        System.out.println(calculo.pesoIdeal(sexo));
    }
}