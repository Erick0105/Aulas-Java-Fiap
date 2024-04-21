public class Transporte extends Despesa{

    //ATRIBUTOS
    private double kmPercorrida;
    private double valorPedagios;

    //GETTERS E SETTERS
    public double getKmPercorrida() {
        return kmPercorrida;
    }
    public double getValorPedagios() {
        return valorPedagios;
    }

    public void setKmPercorrida(double kmPercorrida) {this.kmPercorrida = kmPercorrida;}
    public void setValorPedagios(double valorPedagios) {
        this.valorPedagios = valorPedagios;
    }


    //METÓDOS
    @Override
    public void calcularDespesa() {
        System.out.println("Qual foi a quilometragem percorrida?\n=> ");
        this.kmPercorrida = leitor.nextDouble();
        System.out.println("E Qual seria o valor gasto com pedagios?\n=> ");
        this.valorPedagios = leitor.nextDouble();
        super.setValorTotal((this.kmPercorrida * 3) + this.valorPedagios);
    }

    @Override
    public void listaDespesa() {
        System.out.println("--------------------------------------------------" +
                "\nDescrição: " + super.getDescricao() +
                "\nQuantidade de Km rodado: " + this.getKmPercorrida() + "Km" +
                "\nValor dos pedagios: R$" + this.getValorPedagios() +
                "\nDespesa total: R$" + super.getValorTotal() +
                "\n--------------------------------------------------");

    }
}
