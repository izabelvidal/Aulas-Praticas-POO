public class TrianguloIsosceles extends Triangulo {
    public TrianguloIsosceles(double lado1, double lado2) {
        super(lado1, lado1, lado2);
    }

    @Override
    public String toString(){
        return "Lado 1: " + this.getLado1()
                + "\nLado2: " + this.getLado2()
                + "\nAréa: " + this.area
                + "\nPerimetro: " + this.perimetro;
    }
}
