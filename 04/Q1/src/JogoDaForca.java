import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class JogoDaForca {
    Scanner sc = new Scanner(System.in);

    char[] palavraArray;
    char[] letrasTentadas;
    char[] respostaObtita;
    int vida;
    boolean acertou;

    JogoDaForca(){
        letrasTentadas = new char[26];
        vida = 6;
        acertou = false;
    }


    void jogar(){
        System.out.println("Digite a palavra a ser adivinhada:");
        this.palavraArray = sc.nextLine().toCharArray();
        this.respostaObtita = new char[palavraArray.length];
        for(int i = 0; i < this.palavraArray.length; i++){
            respostaObtita[i] = '-';
        }
        for(int i = 0; i < 26; i++){
            this.letrasTentadas[i] = '-';
        }
        exibirResposta();
    }

    void exibirResposta(){
        for(int i = 0; i< this.respostaObtita.length; i++) {
            System.out.print(this.respostaObtita[i] + " ");
        }
        if(this.vida == 0 || this.acertou){
            exibirResultado();
        }else{
            System.out.println("\nVoce tem " + this.vida + " chances!");
            solicitarLetra();
        }
    }

    void exibirResultado(){
        String resposta = "";
        for(int i = 0; i< this.palavraArray.length; i++) {
            resposta += this.palavraArray[i];
        }
        if(this.vida == 0){
            System.out.println("\n-------------------------------------------------------------");
            System.out.println("Voce nao acertou a palavra " + resposta);
            System.out.println("-------------------------------------------------------------");
        }else {
            System.out.println("\n-------------------------------------------------------------");
            System.out.println("Parabens vc acertou a palavra " + resposta);
            System.out.println("-------------------------------------------------------------");
        }
    }

    void solicitarLetra(){
        System.out.println("Digite uma leta:");
        char entrada = sc.nextLine().charAt(0);
        validarLetra(entrada);
    }

    void validarLetra(char entrada){
        int letrasNaPalavra = 0;
        //repeated letter
        for(int i = 0; i < 26; i++){
            if(entrada == this.letrasTentadas[i]){
                exibirResposta();
            }
        }
        //got it right
        adicionarLetraAorepositorioUsadas(entrada);
        for(int i = 0; i < this.palavraArray.length; i++){
            if(this.palavraArray[i] == entrada){
                this.respostaObtita[i] = entrada;
                letrasNaPalavra++;
            }
        }
        if(letrasNaPalavra != 0){
            checarAcerto();
        }else{
            //got it wrong
            this.vida--;
            exibirResposta();
        }
    }
    void adicionarLetraAorepositorioUsadas(char entrada){
        for(int i = 0; i < 26; i++) {
            if (this.letrasTentadas[i] == '-') {
                this.letrasTentadas[i] = entrada;
                break;
            }
        }
    }
    void checarAcerto(){
        if(Arrays.equals(this.palavraArray, this.respostaObtita)) {
            this.acertou = true;
        }
        exibirResposta();
    }
}