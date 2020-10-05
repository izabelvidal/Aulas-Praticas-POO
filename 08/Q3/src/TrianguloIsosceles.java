public class TrianguloIsosceles extends Triangulo {
    public TrianguloIsosceles(double lado1, double lado2) {
        super(lado1, lado1, lado2);
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
                + "\nAréa: " + this.area
                + "\nPerimetro: " + this.perimetro;
    }
}
