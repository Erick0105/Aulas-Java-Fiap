package tests;
import models.Serie;
import models.Titulo;



public class Principal {
    public static void main(String[] args) {
        Titulo novoTitulo = new Titulo();
        novoTitulo.setNome("Lucifer");
        novoTitulo.setAnoLancamento(2013);
        novoTitulo.setDuracaoMinutos(1500);

        novoTitulo.exibirFichaTecnica();

        Serie novaSerie = new Serie();
        novaSerie.setNome("Naruto");
        novaSerie.setAnoLancamento(2004);
        novaSerie.setDuracaoMinutos(500000);
        novaSerie.setAtivo(false);
        novaSerie.setTemporadas(18);
        novaSerie.setEpPorTemp(20);
        novaSerie.setMinPorEp(24);
    }
}
