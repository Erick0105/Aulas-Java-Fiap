public class Alimentacao extends Despesa {

    private String nomeRestaurante;
    private int qtdeRefeicoes;


    public int getQtdeRefeicoes() {
        return qtdeRefeicoes;
    }

    public void setQtdeRefeicoes(int qtdeRefeicoes) {
        this.qtdeRefeicoes = qtdeRefeicoes;
    }

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    @Override
    public void cadastrasDespesa() {
        super.cadastrasDespesa();
        System.out.println("Qual é o nome do Restaurante? ");
        this.nomeRestaurante = leitor.nextLine();
        System.out.println("Qual é a quantidade de refeições? ");
        this.qtdeRefeicoes = leitor.nextInt();
    }

    @Override
    public void calcularDespesa() {
        super.setValorTotal(qtdeRefeicoes * 18);
    }

    @Override
    public void listaDespesa() {
        System.out.println("----------------------------------\n" +
                        "O nome da empresa é: " + this.getNomeRestaurante() +
                        "\nDescrição: " + super.getDescricao()  +
                        "\nA Quantidade de refeições é igual a: " + this.getQtdeRefeicoes() +
                        "\nA despesa total é de: " + super.getValorTotal());

    }
}
