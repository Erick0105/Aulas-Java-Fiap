import java.util.Scanner;
public abstract class Despesa {
    Scanner leitor = new Scanner(System.in);

    private String descricao;
    private double valorTotal;

    public String getDescricao() {
        return descricao;
    }
    public double getValorTotal() {
        return valorTotal;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void cadastrarDespesa() {
        System.out.println("------------------------------------------------\nQual é a descrição da Despesa? ");
        this.descricao = leitor.nextLine();
        this.valorTotal = 0;

    }




    public void cadastrasDespesa(){

    }
    public abstract void calcularDespesa();
    public abstract void listaDespesa();
}
