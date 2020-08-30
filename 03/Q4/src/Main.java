import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Data data1;
        Data data2;

        System.out.print("Insira o dia da primeira data: ");
        int dia = sc.nextInt();
        System.out.print("Insira o mes da primeira data: ");
        int mes = sc.nextInt();
        System.out.print("Insira o ano da primeira data: ");
        int ano = sc.nextInt();

        if( dia <= 31 | mes <= 12 | ano <= 2020){
            data1 = new Data(dia, mes, ano);
        }else{
            data1 = new Data();
        }

        System.out.println("A data informada é: " + data1.toString());

        System.out.print("Insira o dia da segunda data: ");
        int dia2 = sc.nextInt();
        System.out.print("Insira o mes da segunda data: ");
        int mes2 = sc.nextInt();
        System.out.print("Insira o ano da segunda data: ");
        int ano2 = sc.nextInt();

        if( dia <= 31 | mes <= 12 | ano <= 2020){
            data2 = new Data(dia2, mes2, ano2);
        }else{
            data2 = new Data();
        }

        System.out.println("A data informada é: " + data2.toString());

        System.out.print(data1.vemAntes(data2));
    }
}