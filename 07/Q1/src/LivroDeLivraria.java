public class LivroDeLivraria extends Livro {
    protected double preco;
    protected boolean estoque;

    public LivroDeLivraria(String titulo, String autor, int numeroPaginas, int edicao, double preco){
        super(titulo, autor, numeroPaginas, edicao);
        this.preco = preco;
        this.estoque = false;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }





    @Override
    public String toString() {
        return "Titulo: " + this.titulo +
                "\n Autor: " + this.autor +
                "\n numeroPáginas: " + this.numeroPaginas +
                "\n Edição: " + this.edicao +
                "\n Preço " + this.preco +
                "\n Está em estoque? " + this.estoque;
    }
}
