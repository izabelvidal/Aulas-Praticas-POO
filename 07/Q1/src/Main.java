import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    //livro
        String titulo = sc.nextLine();
        String autor = sc.nextLine();
        int numeroPaginas = sc.nextInt();
        int edicao = sc.nextInt();

        Livro livro = new Livro(titulo, autor, numeroPaginas, edicao);

        /*System.out.println(livro.toString());*/

        System.out.println("Titulo: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Número de Páginas: " + livro.getNumeroPaginas());
        System.out.println("Edição: " + livro.getEdicao());

        //livro de livraria
        double preco = sc.nextDouble();
        int estoque = sc.nextInt();

        LivroDeLivraria livroDeLivraria = new LivroDeLivraria(titulo, autor, numeroPaginas, edicao, preco, estoque);

        /*System.out.println(livroDeLivraria.toString());*/


        System.out.println("Titulo: " + livroDeLivraria.getTitulo());
        System.out.println("Autor: " + livroDeLivraria.getAutor());
        System.out.println("Número de Páginas: " + livroDeLivraria.getNumeroPaginas());
        System.out.println("Edição: " + livroDeLivraria.getEdicao());
        System.out.println("Preço : " + livroDeLivraria.getPreco());
        System.out.println("Estoque: " + livroDeLivraria.getEstoque());

        //livro de biblioteca
        LivroDeBiblioteca livroDeBiblioteca = new LivroDeBiblioteca(titulo, autor, numeroPaginas, edicao);

        /*System.out.println(livroDeBiblioteca.toString());*/
        System.out.println("Titulo: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Número de Páginas: " + livro.getNumeroPaginas());
        System.out.println("Edição: " + livro.getEdicao());
        livroDeBiblioteca.empresta();
        System.out.println("Ta emprestado? " + livroDeBiblioteca.estaEmprestado());

    }
}
