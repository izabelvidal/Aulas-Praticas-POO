public class Main {

    public static void main(String[] args) {
        RepositorioCliente rep = new RepositorioCliente();

        Endereco endereco = new Endereco("Boa Vista", "Aurora", 30);

        Cliente cliente = new Cliente("izabel", "0411", 20, endereco);
        rep.adicionarCliente(cliente);
        Cliente cliente2 = new Cliente("charlie", "0411", 20, endereco);
        rep.adicionarCliente(cliente2);
        Cliente cliente3 = new Cliente("regina", "0411", 20, endereco);
        rep.adicionarCliente(cliente3);


        rep.leObj();

    }
}
