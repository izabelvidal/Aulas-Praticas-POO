public class LivroDeBiblioteca extends Livro {
    protected boolean emprestado;

    public LivroDeBiblioteca(String titulo, String autor, int numeroPaginas, int edicao){
        super(titulo, autor, numeroPaginas, edicao);
        this.emprestado = false;
    }

    public boolean estaEmprestado() {
        if (emprestado) {
            return true;
        } else {
            return false;
        }
    }

    public void empresta() {
        emprestado = true;
    }

    public void devolve() {
        emprestado = false;
    }

    @Override
    public String toString() {
        return "Titulo: " + this.titulo +
                "\n Autor: " + this.autor +
                "\n numeroPáginas: " + this.numeroPaginas +
                "\n Edição: " + this.edicao +
                "\n Emprestado? " + this.emprestado;
    }
}
