import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o nome do destinatário: \n");
        String destinatario = sc.nextLine();

	    CartaoWeb cartaoNamorado = new DiaDosNamorados(destinatario);
	    CartaoWeb cartaoNatal = new Natal(destinatario);
	    CartaoWeb cartaoAniversario = new Aniversario(destinatario);

		System.out.println(cartaoNamorado.exibirMensagem());
	    System.out.println(cartaoNatal.exibirMensagem());
	    System.out.println(cartaoAniversario.exibirMensagem());
    }
}
