//Classe de execução => main
public class CriarLivros {
    public static void main(String[] args) {
        //Instanciando um objeto => criar um objeto na memória
        //tipoObjeto nomeObejto = operadorInstancia   construtor;
        // Livro     favorito =       new              Livro();
        Livro favorito = new Livro();
        favorito.titulo = "O Hobbit";
        favorito.autor = "J. R. R. Talkien";
        favorito.valor =  37.37;
        favorito.editora = "Harper Collins";
        favorito.resumo = "Bilbo era um dos ...";
        favorito.tipoCapa = "Comum";

        System.out.println("Meu livro favorito é: " + favorito.titulo + "\n\nSeu autor é: " + favorito.autor + "\n\nPreço é: " + favorito.valor);

        Livro meuLivro = new Livro();
        meuLivro.titulo = "UML 2.0";
        meuLivro.valor = 50.99;
    }
}
