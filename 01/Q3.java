
package q3;

/**
 *
 * @author izabel vidal
 */
public class Q3 {
    public static void main(String[] args) {
        int x;
        int y;
        int soma;
        
        for(x=100; x>=-100; x--){
            for(y=-100; y<=100; y++){
                soma = x+y;
                if(soma==100 || soma==-100){
                    System.out.printf("x = %d e y = %d \n", x, y);
                }
            }
        }
    }
    
}
