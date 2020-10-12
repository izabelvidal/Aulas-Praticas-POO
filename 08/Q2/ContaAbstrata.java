public abstract class ContaAbstrata {
    protected Cliente cliente;
    protected String numero;
    protected double saldo;

    public ContaAbstrata(Cliente cliente, String numero, double saldo){
        this.cliente = cliente;
        this.numero = numero;
        this.saldo = saldo;
    }

    public Cliente getCliente(){
        return this.cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void debitar(double valor);

    public void creditar(double valor){
        if(valor > 0){
            this.saldo += valor;
        }
    }

    public void transferir(ContaAbstrata conta, double valor){
        this.debitar(valor);
        conta.creditar(valor);
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof ContaAbstrata){
            ContaAbstrata conta2 = (ContaAbstrata)obj;
            if(this.numero.equals(conta2.getNumero())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return "Número da Conta: " + this.getNumero() +
                "Nome do Cliente: " + cliente.getNome();
    }
}
