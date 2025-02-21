package tests;

import models.*;
import models.enums.TipoCapaEnum;

import java.io.IOException;

//Classe de execução => main
public class CriarLivros {
    public static void main(String[] args) throws IOException {
        //Instanciando um objeto => criar o objeto na memória
        // tipoObjeto nomeObjeto = operadorInstanciação  construtor;
        //   models.Livro      favorito =       new               models.Livro();
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

        LivroFisico meuLivro = new LivroFisico("UML 2.0",5.0);
        //meuLivro.titulo = "UML 2.0";
        meuLivro.setValor(58.98);
        meuLivro.setEditora(editora);
        //System.out.println("\n\nTitulo: " + meuLivro.titulo);
        //System.out.println("Autor: " + meuLivro.autor);
        System.out.println(meuLivro.exibirDados());

        LivroDigital livroDigital = new LivroDigital("Teste");
        livroDigital.setTitulo("Senhor dos anéis");
        //livroDigital.

        Revista sql = new Revista();
        sql.setCategoria("Banco de Dados");
        sql.setEditora(editora);
        sql.setPreco(25);
        sql.setTitulo("SQL Magazine - v25");

        RegistroVendas carrinho = new RegistroVendas();
        carrinho.adicionar(favorito);
        carrinho.adicionar(meuLivro);
        carrinho.adicionar(livroDigital);
        carrinho.adicionar(sql);
        carrinho.exibir();
        String path = "D:\\1TDSPM\\Erick\\Aulas-Java-Fiap\\fiap-livraria\\Cupom.txt";
        carrinho.imprimirCupons(path);

    }
}
