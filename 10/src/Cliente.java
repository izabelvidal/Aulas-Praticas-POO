import java.lang.Comparable;
import java.io.Serializable;

public class Cliente implements Comparable, Serializable{
    private String nome;
    private String codigo;
    private int idade;
    private Endereco endereco;

    public Cliente(String nome, String codigo, int idade, Endereco endereco){
        this.nome = nome;
        this.codigo = codigo;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCodigo(){
        return this.codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) { this.idade = idade; }

    public Endereco getEndereco(){ return this.endereco; }
    public void setEndereco(Endereco endereco){ this.endereco = endereco; }

    @Override
    public int compareTo(Object obj){
        Cliente cliente = (Cliente) obj;
        if(this.idade> cliente.getIdade()){
            return 1;
        }else if(this.idade<cliente.getIdade()){
            return -1;
        }else{
            return 0;
        }
    }
}