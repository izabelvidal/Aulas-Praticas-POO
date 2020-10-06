public class Main {
    public static void main(String[] args) {
        RepositorioEndereco repEndereco = new RepositorioEndereco();
        RepositorioCliente fisica = new RepositorioPessoaFisica();
        RepositorioCliente juridica = new RepositorioPessoaJuridica();
        RepositorioContaAbstrata repConta = new RepositorioContaAbstrata();

        Endereco enderecoTeste = new Endereco("Boa Vista","Alipio Medeiros", 236);
        repEndereco.adicionarEndereco(enderecoTeste);

        Cliente clienteTeste = new Cliente("izabel", "110", enderecoTeste);
        if(clienteTeste.getCodigo().length() == 11){
            fisica.adicionarCliente(clienteTeste);
            fisica.buscar(clienteTeste.getCodigo());
        }else if(clienteTeste.getCodigo().length() ==  14){
            juridica.adicionarCliente(clienteTeste);
            juridica.buscar(clienteTeste.getCodigo());
        }

        Conta contaTeste = new Conta(clienteTeste, "110", 115);
        repConta.adicionarConta(contaTeste);

    }
}
