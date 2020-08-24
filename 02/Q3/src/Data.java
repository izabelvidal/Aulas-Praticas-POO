public class Data {
    int dia1;
    int mes1;
    int ano1;
    int dia2;
    int mes2;
    int ano2;

    public Data(int dia1, int mes1, int ano1, int dia2, int mes2, int ano2){
        this.dia1 = dia1;
        this.mes1 = mes1;
        this.ano1 = ano1;
        this.dia2 = dia2;
        this.mes2 = mes2;
        this.ano2 = ano2;
    }

    public boolean compararDia(){
        if(this.dia1 != this.dia2){
            return true;
        }else{
            return false;
        }
    }

    public boolean compararMes(){
        if(this.mes1 != this.mes2){
            return true;
        }else{
            return false;
        }
    }
    public boolean compararAno(){
        if(this.ano1 != this.ano2){
            return true;
        }else{
            return false;
        }
    }
    public boolean vemAntes(){
        if(compararDia() | ){

        }
    }
}
