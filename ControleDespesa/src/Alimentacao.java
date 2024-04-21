public class Alimentacao extends Despesa {

    //ATRIBUTOS
    private String nomeRestaurante;
    private int qtdeRefeicoes;


    //GETTERS E SETTERS
    public int getQtdeRefeicoes() {
        return qtdeRefeicoes;
    }
    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setQtdeRefeicoes(int qtdeRefeicoes) {
        this.qtdeRefeicoes = qtdeRefeicoes;
    }
    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }


    //METÓDOS
    public void calcularDespesa() {
        super.setValorTotal(qtdeRefeicoes * 18);
    }

    @Override
    public void cadastrarDespesa() {
        super.cadastrarDespesa();
        System.out.println("Qual é o nome do Restaurante?\n=>");
        this.nomeRestaurante = leitor.nextLine();
        System.out.println("Qual é a quantidade de refeições?\n=>");
        this.qtdeRefeicoes = leitor.nextInt();
    }

    @Override
    public void listaDespesa() {
        System.out.println("--------------------------------------------------\n" +
                        "O nome da empresa é: " + this.getNomeRestaurante() +
                        "\nDescrição: " + super.getDescricao()  +
                        "\nA Quantidade de refeições é igual a: " + this.getQtdeRefeicoes() +
                        "\nA despesa total é de: R$" + super.getValorTotal() +
                        "\n--------------------------------------------------");

    }
}
