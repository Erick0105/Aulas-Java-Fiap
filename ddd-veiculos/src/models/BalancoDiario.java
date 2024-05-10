package models;

public class BalancoDiario {

    //Atributos
    private static int qtdeCarros;
    private static double total;


    //Metodos
    public void doAdd(Veiculo obj){
        qtdeCarros += 1;
        total += obj.doTotal();
    }

    public String doGerarRelatorio(){
        return "A quantidade de carros foi de: " + qtdeCarros +
                "\nE o total é de: R$" + total +
                "\n---------------------------------------------------";
    }
}
