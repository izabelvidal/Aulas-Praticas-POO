public class Endereco {
    private String bairro;
    private String rua;
    private int numeroCasa;

    public Endereco(String bairro, String rua, int numeroCasa){
        this.bairro = bairro;
        this.rua = rua;
        this.numeroCasa = numeroCasa;
    }

    public String getBairro(){
        return this.bairro;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public String getRua(){
        return this.rua;
    }
    public void setRua(String rua){
        this.rua = rua;
    }

    public int getNumeroCasa(){
        return this.numeroCasa;
    }
    public void setNumeroCasa(int numeroCasa){
        this.numeroCasa = numeroCasa;
    }
}
