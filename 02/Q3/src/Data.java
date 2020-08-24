public class Data {
    int dia, mes, ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean vemAntes(Data data2){
        if(ano < data2.ano){
            return true;
        }else if(ano > data2.ano){
            return false;
        }else if(mes < data2.mes){
            return true;
        }else if(mes >data2.mes){
            return false;
        }else if(dia < data2.dia){
            return true;
        }else if(dia > data2.dia){
            return false;
        }else{
            return true;
        }
    }
}
