package q1;
/**
 *
 * @author Izabel Vidal
 */

import java.util.Scanner;

public class Q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro valor: ");
        int value1 = sc.nextInt();
        System.out.println("Insira o segundo valor: ");
        int value2 = sc.nextInt();
        
        if(value1 % value2 == 0){
            System.out.printf("O número %d é multiplo do número %d\n", value1, value2);
        }else{
            System.out.printf("O número %d não é multiplo do número %d\n", value1, value2);
        }
    }
}
