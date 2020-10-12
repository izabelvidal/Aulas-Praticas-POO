public class Quadrado extends Retangulo {
    public Quadrado(double lado) {
        super(lado, lado);
    }

    /**
     *
     * método sobrescrita do método toString que pertence à classe Object
     *
     * */
    @Override
    public String toString(){
        return "Lado: " + this.getBase()
                + "\nAréa: " + this.area
                + "\nPerimetro: " + this.perimetro;
    }
}
