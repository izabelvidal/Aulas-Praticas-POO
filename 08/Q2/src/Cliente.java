public class Cliente {
    private String nome;
    private String codigo;
    private Endereco endereco;

    public Cliente(String nome, String codigo, Endereco endereco){
        this.nome = nome;
        this.codigo = codigo;
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
    public void setCpf(String codigo){
        this.codigo = codigo;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
}