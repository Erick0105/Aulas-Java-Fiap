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
        Livro favorito = new Livro("O Hobbit");
        //favorito.titulo = "O Hobbit";
        favorito.autor = "J. R. R. Talkien";
        favorito.valor = 37.27;
        favorito.editora = editora;
        favorito.resumo = "Bilbo era um dos ...";
        favorito.tipoCapa = TipoCapaEnum.COMUM;

        System.out.println("Meu livro favorito é:" +
                favorito.titulo + "\nSeu autor é: " + favorito.autor +
                " preço: R$ " + favorito.valor);
        System.out.println(favorito.exibirDados());

        Livro meuLivro = new Livro("UML 2.0",5);
        //meuLivro.titulo = "UML 2.0";
        meuLivro.valor = 58.98;
        meuLivro.editora=editora;
        //System.out.println("\n\nTitulo: " + meuLivro.titulo);
        //System.out.println("Autor: " + meuLivro.autor);
        System.out.println(meuLivro.exibirDados());
    }
}
