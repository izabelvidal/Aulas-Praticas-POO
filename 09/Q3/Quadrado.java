public class Quadrado extends Retangulo {
    public Quadrado(double lado) {
        super(lado, lado);
    }

    @Override
    public String toString(){
        return "Lado: " + this.getBase()
                + "\nAréa: " + this.area
                + "\nPerimetro: " + this.perimetro;
    }
}
