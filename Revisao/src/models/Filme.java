package models;

public class Filme extends Titulo{

    private String diretor;

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public void exibirFichaTecnica() {
        super.exibirFichaTecnica();
        System.out.println("Diretor do Filme: " + diretor);
    }

    @Override
    public void somarAvaliacoes(double nota) {
        somaAvaliacao += nota;
    }
}
