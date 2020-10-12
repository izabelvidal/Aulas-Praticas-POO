public class TrianguloEscaleno extends Triangulo {
    public TrianguloEscaleno(double dimensao1, double dimensao2, double dimensao3) {
        super(dimensao1, dimensao2, dimensao3);
    }

    @Override
    public String toString(){
        return "Lado 1: " + this.getLado1()
                + "\nLado2: " + this.getLado2()
                + "\nLado3: " + this.getLado3()
                + "\nAréa: " + this.area
                + "\nPerimetro: " + this.perimetro;
    }
}
