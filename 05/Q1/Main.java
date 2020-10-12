import java.util.Scanner;

public class Main {
    /**
     *
     * @author Izabel Vidal
     *
     **/

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    float numero1 = sc.nextFloat();
	    float numero2 = sc.nextFloat();
        float numero3 = sc.nextFloat();

	    System.out.print(menorNumero(numero1, numero2, numero3));
    }
    /**
     *
     * @param numero1 -- numero comparado com o resultado da comparação da segunda com a terceira entrada
     * @param numero2 -- numero comparado com a terceira entrada
     * @param numero3 -- numero comparado com a segunda entrada
     * @return o menor numero entre as três entradas
     *
     **/

    public static float menorNumero(float numero1, float numero2, float numero3){
        return Math.min(numero1, Math.min(numero2, numero3));
    }
}
