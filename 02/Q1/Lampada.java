public class Lampada {
    boolean estadoLampada;

    public void acende(){
        this.estadoLampada = true;
    }

    public void apaga(){
        this.estadoLampada = false;
    }

    public void mostraEstrado(){
        if(this.estadoLampada){
            System.out.println("A lâmpada está acesa");
        }else{
            System.out.println("A lâmpada está apagada");
        }
    }
}
