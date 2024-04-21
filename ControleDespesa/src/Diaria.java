public class Diaria extends Despesa{

    //ATRIBUTOS
    private double qtdeDiaria;


    //GETTERS E SETTERS
    public double getQtdeDiaria() {
        return qtdeDiaria;
    }

    public void setQtdeDiaria(double qtdeDiaria) {
        this.qtdeDiaria = qtdeDiaria;
    }


    //METÓDOS
    @Override
    public void calcularDespesa() {
        System.out.println("Qual foi a quantidade de diárias utilizadas?\n=> ");
        this.qtdeDiaria = leitor.nextDouble();
        super.setValorTotal(this.qtdeDiaria * 50);
    }

    @Override
    public void listaDespesa() {
        System.out.println("--------------------------------------------------" +
                "\nDescrição: " + super.getDescricao() +
                "\nQuantidade de diárias: " + this.getQtdeDiaria() +
                "\nDespesa total: R$" + super.getValorTotal() +
                "\n--------------------------------------------------");

    }
}
