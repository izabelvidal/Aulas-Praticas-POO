public class Racional {
    private double numerador;
    private double denominador;

    public Racional(double numerador,double denominador){
        double[] raci = reduzir(numerador,denominador);
        this.denominador = raci[1];
        this.numerador = raci[0];
    }

    private double[] reduzir(double numerador,double denominador){
        double maior;
        if(numerador > denominador) {
            maior = numerador;
        }else{
            maior = denominador;
        }
        for(double i = maior;i>0;i--){
            if(numerador%i == 0 && denominador%i == 0){
                numerador = numerador/i;
                denominador = denominador/i;

            }
        }
        double[] vetor = new double[]{numerador,denominador};
        return vetor;
    }

    public void imprimir(){
        System.out.printf("%.2f/%.2f\n",numerador,denominador);
        System.out.println(numerador/denominador);
    }

    public double getDenominador() {
        return denominador;
    }

    public double getNumerador() {
        return numerador;
    }

    private double mmc(double num){
        double numDenominador = denominador;
        double maior;
        double mmc = 1;
        if(num > numDenominador){
            maior = num;
        }else{
            maior = numDenominador;
        }
        double[] mmcD= new double[(int)maior];
        double[] mmcND = new double[(int)maior];

        //divisores de numDenominador
        for(int j = 0; j < mmcND.length;j++){
            for(int i = 2; i <= maior; i++){
                if(num%i == 0){
                    num = num/i;
                    mmcND[j] = i;
                    break;
                }else{
                    mmcND[j] = 1;
                }
            }
        }
        //divisores de denominador
        for(int j = 0; j < mmcD.length;j++){
            for(int i = 2; i <= maior; i++){
                if(numDenominador%i == 0){
                    numDenominador = numDenominador/i;
                    mmcD[j] = i;
                    break;
                }else{
                    mmcD[j] = 1;
                }
            }
        }
        //mmc

        for(int i = 0; i <= (mmcD.length-1);i++){
            if (mmcD[i] == mmcND[i]){
                mmc =mmc*mmcD[i];
            }else{
                mmc =mmc*mmcD[i];
                mmc =mmc*mmcND[i];
            }
        }
        return mmc;
    }

    public Racional somar(Racional num){
        double numDenominador = num.getDenominador();
        double numNumerador = num.getNumerador();
        double mmc = mmc(numDenominador);

        double novoDenominador = mmc/denominador;
        numDenominador = mmc/numDenominador;

        double novoNumerador = numerador * novoDenominador;
        numNumerador = numNumerador * numDenominador;

        double somaNumerador = novoNumerador + numNumerador;
        Racional novo = new Racional(somaNumerador,mmc);
        return novo;
    }

    public Racional diminuir(Racional num){
        double numDenominador = num.getDenominador();
        double numNumerador = num.getNumerador();
        double mmc = mmc(numDenominador);
        double novoDenominador = mmc/denominador;
        numDenominador = mmc/numDenominador;

        double novoNumerador = numerador * novoDenominador;
        numNumerador = numNumerador * numDenominador;

        double diferencaNumerador = novoNumerador - numNumerador;
        Racional novo = new Racional(diferencaNumerador,mmc);
        return novo;
    }

    public Racional multiplicar(Racional num){
        double multNumerador = numerador * num.getNumerador();
        double multDenominador = denominador * num.getDenominador();
        Racional novo = new Racional(multNumerador,multDenominador);
        return novo;
    }

    public Racional dividir(Racional num){
        double divNumerador = numerador * num.getDenominador();
        double divDenominador = denominador * num.getNumerador();
        Racional novo = new Racional(divNumerador,divDenominador);
        return novo;
    }

}
