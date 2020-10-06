import java.util.ArrayList;

public class RepositorioPessoaFisica extends RepositorioCliente {
    private ArrayList<Cliente> arrayPessoaFisica;

    public RepositorioPessoaFisica(){
        this.arrayPessoaFisica = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente){
        this.arrayPessoaFisica.add(cliente);
    }

    public Cliente buscar(String procuraCodigo){
        Cliente retorno = null;

        int tamanho = this.arrayPessoaFisica.size();
        for(int i=0; i<tamanho; i++){
            if(this.arrayPessoaFisica.get(i).getCodigo().equals(procuraCodigo)){
                retorno = this.arrayPessoaFisica.get(i);
                break;
            }
        }
        return retorno;
    }

    public void removerCliente(Cliente cliente){
        for(int i = 0; i < arrayPessoaFisica.size(); i++){
            if(arrayPessoaFisica.get(i).equals(cliente)){
                arrayPessoaFisica.remove(arrayPessoaFisica.get(i));
            }
        }
    }
}
