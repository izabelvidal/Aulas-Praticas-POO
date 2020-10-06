public class Poupança extends Conta {
    private double juros = 0.2;

    public Poupança(Cliente cliente, String numero, double saldo){
        super(cliente, numero, saldo);
    }

    public void renderJuros(){
        this.creditar(this.saldo*juros);
    }
}
