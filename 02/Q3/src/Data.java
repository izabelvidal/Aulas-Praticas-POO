public class Data {
    int dia, mes, ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean vemAntes(int dia, int mes, int ano){
        if(ano < this.ano){
            return true;
        }else if(ano > this.ano){
            return false;
        }else if( mes < this.mes){
            return true;
        }else if(mes > this.mes){
            return false;
        }else if(dia < this.dia){
            return true;
        }else if(dia > this.dia){
            return false;
        }else{
            return false;
        }
    }
}
