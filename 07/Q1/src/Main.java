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

        System.out.println(livro.toString());

        //livro de livraria
        double preco = sc.nextDouble();
        int estoque = sc.nextInt();

        LivroDeLivraria livroDeLivraria = new LivroDeLivraria(titulo, autor, numeroPaginas, edicao, preco, estoque);

        System.out.println(livroDeLivraria.toString());

        //livro de biblioteca
        LivroDeBiblioteca livroDeBiblioteca = new LivroDeBiblioteca(titulo, autor, numeroPaginas, edicao);

        System.out.println(livroDeBiblioteca.toString());

    }
}
