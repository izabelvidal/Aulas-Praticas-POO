public class TrianguloEscaleno extends Triangulo {
    public TrianguloEscaleno(double dimensao1, double dimensao2, double dimensao3) {
        super(dimensao1, dimensao2, dimensao3);
    }

    /**
     *
     * método sobrescrita do método toString que pertence à classe Object
     *
     * */
    @Override
    public String toString(){
        return "Lado 1: " + this.dimensao1
                + "\nLado2: " + this.dimensao2
                + "\nLado3: " + this.dimensao3
                + "\nAréa: " + this.area
                + "\nPerimetro: " + this.perimetro;
    }
}
