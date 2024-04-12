public class Livro {

    //---ATRIBUTOS ---///
    //+ (public) TipoDado nomeAtributoOuVariavel
    public String titulo;
    public String autor;
    public double valor;
    public Editora editora;
    public int paginas;
    public String resumo;
    public TipoCapaEnum tipoCapa;


    // --- MÉTODOS ---
    public String exibirDados(){
        String dados =
                "---------------" +
                        "\nTitulo: " + this.titulo +
                        "\nResumo: " + this.resumo +
                        "\nPreço: R$ " + this.valor +
                        "\nPáginas: " + this.paginas +
                        "\nAutor: " + this.autor +
                        "\nEditora:" + this.editora.nome +
                        "\n---------------" ;               ;
        return dados;
    }
    public Livro(String titulo){
        this.titulo = titulo;
    }

    public Livro(){}
    public Livro(String titulo, double preco){
        this.titulo = titulo;
        this.valor = preco;
    }
    public Livro(String titulo, String autor,
                 double valor, Editora editora,
                 int paginas, String resumo,
                 TipoCapaEnum tipoCapa) {
        this.titulo = titulo;
        this.autor = autor;
        this.valor = valor;
        this.editora = editora;
        this.paginas = paginas;
        this.resumo = resumo;
        this.tipoCapa = tipoCapa;
    }
}