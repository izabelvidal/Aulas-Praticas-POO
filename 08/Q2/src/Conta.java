public class Conta extends ContaAbstrata {
    public Conta(Cliente cliente, String numero, double saldo){
        super(cliente, numero, saldo);
    }

    @Override
    public void debitar(double valor){
        if(saldo >= valor){
            this.saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente!!!");
        }
    }
}
