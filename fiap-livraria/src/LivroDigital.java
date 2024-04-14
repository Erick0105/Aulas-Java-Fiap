public class LivroDigital extends Livro {
    private String marcaAgua;

    public String getMarcaAgua() {
        return marcaAgua;
    }
    public LivroDigital(){
        setTipoCapa(TipoCapaEnum.COMUM);
    }

    public void setMarcaAgua(String marcaAgua) {
        this.marcaAgua = marcaAgua;
    }
    @Override
    public String exibirDados() {
        return super.exibirDados() +  "\nMarca D'Agua: " + this.getMarcaAgua() + "\n---------------";
    }
    @Override
    public double aplicarDesconto(){
        return getValor() * 0.8;
    }

}
