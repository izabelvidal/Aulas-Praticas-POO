import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class RepositorioCliente {
    private ArrayList<Cliente> arrayClientes;

    public RepositorioCliente() {
        this.arrayClientes = new ArrayList<>();
    }

    public Cliente buscar(String procuraCodigo){
        Cliente retorno = null;

        int tamanho = this.arrayClientes.size();
        for(int i=0; i<tamanho; i++){
            if(this.arrayClientes.get(i).getCodigo().equals(procuraCodigo)){
                retorno = this.arrayClientes.get(i);
                break;
            }
        }
        return retorno;
    }

    public void removerCliente(Cliente cliente){
        for(int i = 0; i < arrayClientes.size(); i++){
            if(arrayClientes.get(i).equals(cliente)){
                arrayClientes.remove(arrayClientes.get(i));
            }
        }
    }

    public void gravarObj(Object obj){
        try{
            FileOutputStream fileOut = new FileOutputStream("clientes.dat");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(obj);
            objectOut.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public Object leObj(){
        try{
            FileInputStream fileIn = new FileInputStream("clients.dat");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            Object obj = objectIn.readObject();

            objectIn.close();
            return obj;
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
}