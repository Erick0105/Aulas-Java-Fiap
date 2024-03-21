import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o valor da base do triângulo?");
        double base = leitor.nextDouble();
        System.out.println("E qual o valor da altura deste triângulo?");
        double altura = leitor.nextDouble();

        Triangulo triangulo = new Triangulo(base,altura);

        System.out.println(triangulo.area());
    }
}