public class Data {
    int dia, mes, ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        if(this.dia <= 0 || this.dia > 31){
            this.dia = 04;
        }
        this.mes = mes;
        if(this.mes <= 0 || this.mes > 12){
            this.mes = 11;
        }

        this.ano = ano;
        if(this.ano <= 0 ||this.ano > 2020){
            this.ano = 1999;
        }
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

    @Override
    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}