public class Lampada{
    boolean estadoLampada;
    Contador counter = new Contador();

    void acende(){
        if(!this.estadoLampada){
            this.estadoLampada = true;
            this.counter.incrementar();
        }
    }

    void apaga(){
        if(this.estadoLampada){
            this.estadoLampada = false;
        }
    }

    void mostraEstado(){
        if(this.estadoLampada){
            System.out.println("A lampada está acesa");
        }else{
            System.out.println("A lampada está apagada");
        }
    }

    int mostraQuantasVezesFoiAcesa(){
        return this.counter.imprimir();
    }
}
