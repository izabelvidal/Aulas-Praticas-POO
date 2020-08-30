public class Contador{
    int valor;

    public Contador(int valor){
        this.valor = valor;
    }

    public Contador(){
        this.valor = 0;
    }

    void zerar(){
        this.valor = 0;
    }

    void incrementar(){
        this.valor++;
    }

    int imprimir(){
        return this.valor;
    }
}
