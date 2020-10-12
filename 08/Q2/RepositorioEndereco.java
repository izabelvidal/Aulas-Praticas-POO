import java.util.ArrayList;

public class RepositorioEndereco {
    private ArrayList<Endereco> arrayEnderecos;

    public RepositorioEndereco() {
        this.arrayEnderecos = new ArrayList<>();
    }

    public void adicionarEndereco(Endereco endereco){
        this.arrayEnderecos.add(endereco);
    }

    public void removerEndereco(Endereco endereco){
        for(int i = 0; i < arrayEnderecos.size(); i++){
            if(arrayEnderecos.get(i).equals(endereco)){
                arrayEnderecos.remove(arrayEnderecos.get(i));
            }
        }
    }
}