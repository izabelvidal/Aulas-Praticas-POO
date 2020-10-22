import java.io.*;
import java.util.ArrayList;

public class RepositorioCliente{

    private ArrayList<Cliente> arrayClientes;

    public RepositorioCliente(){
        this.arrayClientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        this.arrayClientes.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        for (int i = 0; i < arrayClientes.size(); i++) {
            if (arrayClientes.get(i).equals(cliente)) {
                arrayClientes.remove(arrayClientes.get(i));
            }
        }
    }

    public void buscarCliente(String codigo) {
        for (int i = 0; i < arrayClientes.size(); i++) {
            if (arrayClientes.get(i).equals(codigo)) {
                System.out.print(arrayClientes);
            } else{
                System.out.print("Cliente não existe");
            }
        }
    }

    public ArrayList<Cliente> getCliente(){
        return this.arrayClientes;
    }

    public void gravarObj(Object obj){
        try{
            FileOutputStream file = new FileOutputStream("clientes.dat");
            ObjectOutputStream os = new ObjectOutputStream(file);
            os.writeObject(obj);
            os.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void leObj(){
        InputStream inputStream;
        try{
            inputStream = new BufferedInputStream(new FileInputStream("clientes.dat"));

            int data = inputStream.read();
            while (data != -1){
                System.out.println((char) data);
                data = inputStream.read();
            }
            /*FileInputStream file = new FileInputStream("clientes.dat");
            ObjectInputStream is = new ObjectInputStream(file);

            Object obj = is.readObject();
            is.close();
            return obj;*/
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }catch(IOException ex2){
            ex2.printStackTrace();
        }
    }
}