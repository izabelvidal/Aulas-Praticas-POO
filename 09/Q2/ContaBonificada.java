public class ContaBonificada extends Conta{
    private double bonus;
    private double taxaBonus = 0.1;

    public ContaBonificada(Cliente cliente, String numero, double saldo){
        super(cliente, numero, saldo);
    }

    @Override
    public void creditar(double valor){
        bonus += (valor*taxaBonus);
        super.creditar(valor);
    }

    public void renderBonus(){
        super.creditar(bonus);
        bonus = 0;
    }
}
