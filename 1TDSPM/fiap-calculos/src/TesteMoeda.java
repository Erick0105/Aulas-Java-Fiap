import java.sql.SQLOutput;
import java.util.Scanner;

public class TesteMoeda {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        Moeda moeda = new Moeda();

        System.out.println("Informe o valor atual de Reais R$");
        moeda.valorReal = leia.nextDouble();
        System.out.println("Informe a cotação do dólar atual");
        moeda.cotacaoDolar = leia.nextDouble();


        moeda.calcularConversao();

        System.out.println(moeda.quantidadeDolar);

        System.out.println(moeda.retornarCalculoConversa());
    }
}
