package models;

public class Veiculo {


    //Atributos
    private double valorHora;
    private double valorAdicional;
    private double horas;


    //Getters e Setters
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }
    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double getHoras() {
        return horas;
    }
    public void setHoras(double horas) {
        this.horas = horas;
    }


    //Metodos
    public double doTotal(){
        double var = this.valorHora + this.valorAdicional * (this.horas - 1);
        return var;
    }

    public String doViewCupom(){
        return "---------------------------------------------------" +
                "\nCupom do Estacionamento" +
                "\n\nValor da Hora é igual a: " + this.valorHora + " horas" +
                "\nValor adicional: R$" + this.valorAdicional +
                "\nQuantidade de horas: " + this.horas + " horas" +
                "\nTotal a ser pago: R$" + this.doTotal() +
                "\n---------------------------------------------------";
    }
}
