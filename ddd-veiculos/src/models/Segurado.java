package models;

public class Segurado extends Veiculo implements ISeguroService{


    //Atributos
    private double seguro;


    //Getters e Setters
    public double getSeguro() {
        return seguro;
    }
    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }


    //Metodos
    public Segurado (double seguro){
        this.seguro = seguro;
    }

    @Override
    public double doDesconto(){
        double desc = super.doTotal() * seguro /100;
        return desc;
    }

    @Override
    public double doTotal() {
        double var = super.doTotal() - doDesconto();
        return var;
    }

    @Override
    public String doViewCupom() {
        return super.doViewCupom() + "\nValor de Desconto: R$" + this.doDesconto() +
                "\nNovo valor total a ser pago: R$" + this.doTotal() +
                "\n---------------------------------------------------";
    }
}
