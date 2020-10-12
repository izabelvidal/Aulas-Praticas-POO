public class Main {

    public static void main(String[] args) {
        RepositorioCliente rep = new RepositorioPessoaFisica();
        Endereco endereco = new Endereco("Boa Vista", "Aurora", 30);

	    Cliente cliente = new Cliente("izabel", "0411", 20, endereco);
	    rep.adicionarCliente(cliente);



        Cliente[] vetor = rep.getContas();

    }
}
