package br.com.fiap.api_rest.model;

public enum EnumCategoria {
    BRONZE("BRONZE"),
    PRATA("PRATA"),
    OURO("OURO");

    private String descricao;

    EnumCategoria(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
