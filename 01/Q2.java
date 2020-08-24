package q2;

/**
 *
 * @author Izabel Vidal
 */
public class Q2 {
    public static void main(String[] args) {
        int produto = 1;
        for(int i=1; i<=15; i++){
            if(i%2 != 0){
                produto *= i;
            }
        }
        
        System.out.println(produto);
    }
    
}
