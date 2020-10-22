public class Main {

    public static void main(String[] args) {
        RepositorioCliente rep = new RepositorioCliente();

        Endereco endereco = new Endereco("Boa Vista", "Aurora", 30);

        Cliente cliente = new Cliente("izabel", "0411", 20, endereco);
        rep.gravarObj(cliente);

        rep.leObj();

    }
}
