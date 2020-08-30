import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Insira o dia da primeira data: ");
	    int dia = sc.nextInt();
        System.out.print("Insira o mes da primeira data: ");
        int mes = sc.nextInt();
        System.out.print("Insira o ano da primeira data: ");
        int ano = sc.nextInt();

        Data data1 = new Data(dia, mes, ano);

        System.out.print("Insira o dia da segunda data: ");
        int dia2 = sc.nextInt();
        System.out.print("Insira o mes da segunda data: ");
        int mes2 = sc.nextInt();
        System.out.print("Insira o ano da segunda data: ");
        int ano2 = sc.nextInt();

        Data data2 = new Data(dia2, mes2, ano2);

        System.out.print(data1.vemAntes(data2));
    }
}
