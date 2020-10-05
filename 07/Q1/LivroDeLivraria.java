public class LivroDeLivraria extends Livro {
    protected double preco;
    protected int estoque;

    public LivroDeLivraria(String titulo, String autor, int numeroPaginas, int edicao, double preco, int estoque){
        super(titulo, autor, numeroPaginas, edicao);
        this.preco = preco;
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public boolean temEmEstoque(){
        if(this.estoque < 0){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Titulo: " + this.titulo +
                "\nAutor: " + this.autor +
                "\nnumeroPáginas: " + this.numeroPaginas +
                "\nEdição: " + this.edicao +
                "\nPreço " + this.preco +
                "\nQuantos em estoque? " + this.estoque;
    }
}
