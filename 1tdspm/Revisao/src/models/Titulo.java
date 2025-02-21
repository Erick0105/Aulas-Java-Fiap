package models;

public abstract class Titulo {
    //Atributos -> Caraterísticas
    private String nome;
    private int anoLancamento;
    private int duracaoMinutos;
    protected double somaAvaliacao;
    protected int totalAvaliacoes;
    private ClassificacaoEnum classificacaoIndicativa;



    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }
    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void setTotalAvaliacoes(int totalAvaliacoes) {
        this.totalAvaliacoes = totalAvaliacoes;
    }

    public double getSomaAvaliacao() {
        return somaAvaliacao;
    }

    public void setSomaAvaliacao(double somaAvaliacao) {
        this.somaAvaliacao = somaAvaliacao;
    }

    public ClassificacaoEnum getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public void setClassificacaoIndicativa(ClassificacaoEnum classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    //Métodos
    public void exibirFichaTecnica(){
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }
    //Método abstrato
    public abstract void somarAvaliacoes(double nota);
}
