import java.util.Scanner;

public class testeRacional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numerador1 = sc.nextInt();
        int denominador1 = sc.nextInt();
        int numerador2 = sc.nextInt();
        int denominador2 = sc.nextInt();


        System.out.println("num1:");
        Racional num = new Racional(numerador1, denominador1);
        num.imprimir();
        System.out.println("num2:");
        Racional num2 = new Racional(numerador2,denominador2);
        num2.imprimir();
        System.out.println("num1 + num2:");
        Racional num3 = num.somar(num2);
        num3.imprimir();
        System.out.println("num1 - num2:");
        Racional num4 = num.diminuir(num2);
        num4.imprimir();
        System.out.println("num1 / num2:");
        Racional num5 = num.dividir(num2);
        num5.imprimir();
        System.out.println("num1 * num2:");
        Racional num6 = num.multiplicar(num2);
        num6.imprimir();
    }
}
