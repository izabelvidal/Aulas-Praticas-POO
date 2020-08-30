public class Lampada {
    boolean estadoLampada;
    int voltagem;

    public Lampada(int voltagem){
        this.voltagem = voltagem;
    }

    public void acende(){
        if(!this.estadoLampada){
            this.estadoLampada = true;
        }
    }

    public void apaga(){
        if(this.estadoLampada){
            this.estadoLampada = false;
        }
    }

    public void mostraEstado(){
        if(this.estadoLampada){
            System.out.println("A lâmpada está acesa");
        }else{
            System.out.println("A lâmpada está apagada");
        }
    }

    public boolean eEconomica(){
        if(this.voltagem<40){
            return true;
        }else{
            return false;
        }
    }


}
