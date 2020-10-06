import java.util.ArrayList;

public class RepositorioPessoaJuridica extends RepositorioCliente{
    private ArrayList<Cliente> arrayPessoaJuridica;

    public RepositorioPessoaJuridica(){
        this.arrayPessoaJuridica = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente){
        this.arrayPessoaJuridica.add(cliente);
    }

    public Cliente buscar(String procuraCodigo){
        Cliente retorno = null;
        int tamanho = this.arrayPessoaJuridica.size();
        for(int i=0; i<tamanho; i++){
            if(this.arrayPessoaJuridica.get(i).getCodigo().equals(procuraCodigo)){
                retorno = this.arrayPessoaJuridica.get(i);
                break;
            }
        }
        return retorno;
    }

    public void removerCliente(Cliente cliente){
        for(int i = 0; i < arrayPessoaJuridica.size(); i++){
            if(arrayPessoaJuridica.get(i).equals(cliente)){
                arrayPessoaJuridica.remove(arrayPessoaJuridica.get(i));
            }
        }
    }
}
