public class Data {
    int dia, mes, ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean vemAntes(int dia2, int mes2, int ano2){
        if(ano < ano2){
            return true;
        }else if(ano > ano2){
            return false;
        }else if( mes < mes2){
            return true;
        }else if(mes > mes2){
            return false;
        }else if(dia < dia2){
            return true;
        }else if(dia > dia2){
            return false;
        }else{
            return false;
        }
    }
}
