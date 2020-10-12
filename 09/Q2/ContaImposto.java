public class ContaImposto extends Conta{
    private double taxaImposto = 0.2;

    public ContaImposto(Cliente cliente, String numero, double saldo){
        super(cliente, numero, saldo);
    }

    @Override
    public void debitar(double valor){
        double valorFinal = valor + (valor*taxaImposto);
        if(valorFinal >= this.saldo){
            this.saldo -= valorFinal;
        }else{
            System.out.println("Saldo Insuficiente!!!");
        }
    }

}
