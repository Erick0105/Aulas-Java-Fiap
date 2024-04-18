public class LivroFisico extends Livro{

    public LivroFisico(String titulo) {
        super(titulo);
    }

    public LivroFisico(String titulo, double preco) {
        super(titulo, preco);
    }

    public double getTaxaImpressao(){
        return super.getValor() * 0.05;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + "\nTaxa de impressão: " + this.getTaxaImpressao() + "\n---------------";
    }
}
