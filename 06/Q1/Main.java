import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Retangulo retangulo = new Retangulo();

	    double largura = sc.nextDouble();
	    double altura = sc.nextDouble();

	    retangulo.setLargura(largura);
	    retangulo.setAltura(altura);

	    System.out.println("Largura: " + retangulo.getLargura());
	    System.out.println("Altura: " + retangulo.getAltura());

	    System.out.println("Perimetro: " + retangulo.calcularPerimetro());
	    System.out.println("Area: " + retangulo.calcularArea());
    }
}
