public class TrianguloEquilatero extends Triangulo {
    public TrianguloEquilatero(double lado) {
        super(lado, lado, lado);
    }

    @Override
    public String toString() {
        return "Lados: " + this.dimensao1
                + "\nAréa: " + this.area
                + "\nPerimetro: " + this.perimetro;
    }
}
