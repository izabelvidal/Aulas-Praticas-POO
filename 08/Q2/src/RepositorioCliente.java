import java.util.ArrayList;

public class RepositorioCliente {
    private ArrayList<Cliente> arrayClientes;

    public RepositorioCliente() {
        this.arrayClientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente){
        this.arrayClientes.add(cliente);
    }

    public void removerCliente(Cliente cliente){
        for(int i = 0; i < arrayClientes.size(); i++){
            if(arrayClientes.get(i).equals(cliente)){
                arrayClientes.remove(arrayClientes.get(i));
            }
        }
    }
}