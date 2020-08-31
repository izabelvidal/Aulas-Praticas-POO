public class Main {

    public static void main(String[] args) {

        Data data1;
        Data data2;

        //data 1
        int dia = 12;
        int mes = 12;
        int ano = 2012;

        if( dia <= 31 && mes <= 12 && ano <= 2020){
            data1 = new Data(dia, mes, ano);
        }else{
            data1 = new Data();
        }

        System.out.println("A data informada é: " + data1.toString());

        //data 2
        int dia2 = 32;
        int mes2 = 12;
        int ano2 = 2020;

        if( dia2 <= 31 && mes2 <= 12 && ano2 <= 2020){
            data2 = new Data(dia2, mes2, ano2);
        }else{
            data2 = new Data();
        }

        System.out.println("A data informada é: " + data2.toString());

        System.out.print(data1.vemAntes(data2));
    }
}