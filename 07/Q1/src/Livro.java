public class Livro {
    protected String titulo;
    protected String autor;
    protected int numeroPaginas;
    protected int edicao;

    public Livro(String titulo, String autor, int numeroPaginas, int edicao){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.edicao = edicao;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getNumeroPaginas(){
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas){
        this.numeroPaginas = numeroPaginas;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public String toString() {
        return "Titulo: " + this.titulo +
                "\nAutor: " + this.autor +
                "\nnumeroPáginas: " + this.numeroPaginas +
                "\nEdição: " + this.edicao;
    }
}
