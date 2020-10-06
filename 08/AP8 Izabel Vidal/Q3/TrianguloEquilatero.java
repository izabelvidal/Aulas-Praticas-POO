public class TrianguloEquilatero extends Triangulo {
    public TrianguloEquilatero(double lado) {
        super(lado, lado, lado);
    }

    /**
     *
     * método sobrescrita do método toString que pertence à classe Object
     *
     * */
    @Override
    public String toString() {
        return "Lados: " + this.dimensao1
                + "\nAréa: " + this.area
                + "\nPerimetro: " + this.perimetro;
    }
}
