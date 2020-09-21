public class Racional {
    private int numerador;
    private int denominador;

    public Racional(int numerador,int denominador){
        int[] raci = reduzir(numerador,denominador);
        this.denominador = raci[1];
        this.numerador = raci[0];
    }

    private int[] reduzir(int numerador,int denominador){
        int maior;
        if(numerador > denominador) {
            maior = numerador;
        }else{
            maior = denominador;
        }
        for(int i = maior;i>0;i--){
            if(numerador%i == 0 && denominador%i == 0){
                numerador = numerador/i;
                denominador = denominador/i;

            }
        }
        int[] vetor = new int[]{numerador,denominador};
        return vetor;
    }

    public void imprimir(){
        if(denominador==1){
            System.out.printf(" %d\n",numerador);
        }else {
            System.out.printf(" %d/%d\n",numerador,denominador);
        }
    }

    public int getDenominador() {
        return denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    private int mmc(int num){
        int numDenominador = denominador;
        int maior;
        int mmc = 1;
        if(num > numDenominador){
            maior = num;
        }else{
            maior = numDenominador;
        }
        int[] mmcD= new int[(int)maior];
        int[] mmcND = new int[(int)maior];

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
        int numDenominador = num.getDenominador();
        int numNumerador = num.getNumerador();
        int mmc = mmc(numDenominador);

        int novoDenominador = mmc/denominador;
        numDenominador = mmc/numDenominador;

        int novoNumerador = numerador * novoDenominador;
        numNumerador = numNumerador * numDenominador;

        int somaNumerador = novoNumerador + numNumerador;
        Racional novo = new Racional(somaNumerador,mmc);
        return novo;
    }

    public Racional diminuir(Racional num){
        int numDenominador = num.getDenominador();
        int numNumerador = num.getNumerador();
        int mmc = mmc(numDenominador);
        int novoDenominador = mmc/denominador;
        numDenominador = mmc/numDenominador;

        int novoNumerador = numerador * novoDenominador;
        numNumerador = numNumerador * numDenominador;

        int diferencaNumerador = novoNumerador - numNumerador;
        Racional novo = new Racional(diferencaNumerador,mmc);
        return novo;
    }

    public Racional multiplicar(Racional num){
        int multNumerador = numerador * num.getNumerador();
        int multDenominador = denominador * num.getDenominador();
        Racional novo = new Racional(multNumerador,multDenominador);
        return novo;
    }

    public Racional dividir(Racional num){
        int divNumerador = numerador * num.getDenominador();
        int divDenominador = denominador * num.getNumerador();
        Racional novo = new Racional(divNumerador,divDenominador);
        return novo;
    }

}
