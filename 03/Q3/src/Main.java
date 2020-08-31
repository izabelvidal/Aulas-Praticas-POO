public class Main {

    public static void main(String[] args) {

        Data data1;
        Data data2;

        //data 1
        int dia = -1;
        int mes = -2;
        int ano = -8;

        data1 = new Data(dia, mes, ano);

        System.out.println("A data informada é: " + data1.toString());

        //data 2
        int dia2 = 11;
        int mes2 = 11;
        int ano2 = 1962;

        data2 = new Data(dia2, mes2, ano2);


        System.out.println("A data informada é: " + data2.toString());

        System.out.print(data1.vemAntes(data2));
    }
}