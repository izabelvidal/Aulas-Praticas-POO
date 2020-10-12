import java.util.ArrayList;

public abstract class RepositorioCliente {
    private ArrayList<Cliente> arrayClientes;

    public RepositorioCliente() { this.arrayClientes = new ArrayList<>(); }

    public abstract void adicionarCliente(Cliente cliente);

    public abstract Cliente buscar(String procuraCodigo);

    public abstract void removerCliente(Cliente cliente);
}