public class Quadrado extends Retangulo {
    public Quadrado(double lado) {
        super(lado, lado);
    }

    @Override
    public String toString(){
        return "Lado: " + this.dimensao1
                + "\nAréa: " + this.area
                + "\nPerimetro: " + this.perimetro;
    }
}
