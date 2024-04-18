//Classe de execução => main
public class CriarLivros {
    public static void main(String[] args) {
        //Instanciando um objeto => criar o objeto na memória
        // tipoObjeto nomeObjeto = operadorInstanciação  construtor;
        //   Livro      favorito =       new               Livro();
        //Instanciar editora
        Editora editora = new Editora();
        editora.nome = "Harper Collins";
        editora.representante = "Joao";
        LivroFisico favorito = new LivroFisico("O Hobbit");
        //favorito.titulo = "O Hobbit";
        favorito.setAutor("J. R. R. Talkien");
        favorito.setValor(37.27);
        favorito.setEditora(editora);
        favorito.setResumo("Bilbo era um dos ...");
        favorito.setTipoCapa(TipoCapaEnum.COMUM);

        System.out.println("Meu livro favorito é:" +
                favorito.getTitulo() + "\nSeu autor é: " + favorito.getAutor() +
                " preço: R$ " + favorito.getValor());
        System.out.println(favorito.exibirDados());

        LivroFisico meuLivro = new LivroFisico("UML 2.0",5);
        //meuLivro.titulo = "UML 2.0";
        meuLivro.setValor(58.98);
        meuLivro.setEditora(editora);
        //System.out.println("\n\nTitulo: " + meuLivro.titulo);
        //System.out.println("Autor: " + meuLivro.autor);
        System.out.println(meuLivro.exibirDados());

        //Objeto que está na herança
        LivroDigital livroNovoDigital = new LivroDigital();
        livroNovoDigital.setTitulo("Harry potter");
        livroNovoDigital.setEditora(editora);
        livroNovoDigital.setMarcaAgua("Verdadeira");
        System.out.println(livroNovoDigital.exibirDados());
    }
}
