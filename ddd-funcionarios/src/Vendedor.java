public class Vendedor extends Funcionario{


    //ATRIBUTOS
    private double comissao;


    //--GETTERS E SETTERS
    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }


    //MÉTODOS
    @Override
    public double calculaBonificacao() {
        return super.calculaBonificacao() + 500;
    }

    public double calculaComissao(double valorVendido){
        this.comissao = 0.10 * valorVendido;
        return super.getSalario() + this.comissao;
    }
}
