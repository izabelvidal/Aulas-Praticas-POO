import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("informe o consumo da lâmpada em Watts: ");
        int voltagem = sc.nextInt();

        Lampada lamp = new Lampada(voltagem);

        lamp.mostraEstado();
        lamp.acende();
        lamp.mostraEstado();
        System.out.print(lamp.eEconomica());
    }
}
