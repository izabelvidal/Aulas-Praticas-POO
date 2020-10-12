import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        RepositorioCliente rep = new RepositorioPessoaFisica();
        Endereco endereco = new Endereco("Boa Vista", "Aurora", 30);

	    Cliente cliente = new Cliente("izabel", "0411", 20, endereco);
	    rep.adicionarCliente(cliente);

        Cliente cliente3 = new Cliente("regina", "0411", 15, endereco);
        rep.adicionarCliente(cliente3);

        Cliente cliente2 = new Cliente("Charlie", "2105", 2, endereco);
        rep.adicionarCliente(cliente2);

        Cliente[] vetor = ((RepositorioPessoaFisica) rep).getClientes().toArray(new Cliente[0]);

        Arrays.sort(vetor);

        for(Cliente c: vetor){
            System.out.println(c.getIdade());
        }


    }
}
