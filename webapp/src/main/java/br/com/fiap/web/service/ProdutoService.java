package br.com.fiap.web.service;

import br.com.fiap.web.dao.ProdutoDao;
import br.com.fiap.web.model.Produto;

import java.util.List;

public class ProdutoService {

    private ProdutoDao produtoDao = new ProdutoDao();

    public List<Produto> listar(){
        return produtoDao.listar();
    }


    //Retornar um único produto -> buscarPorId
    public Produto buscarPorId(int codigo){
        return produtoDao.buscarPorId(codigo);
    }


    public void cadastrar(Produto produto){
        produtoDao.inserir(produto);
    }

    public void atualizar(Produto produto){
        produtoDao.atualizar(produto);
    }
}
