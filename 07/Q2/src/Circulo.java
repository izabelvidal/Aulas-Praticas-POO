public class Circulo extends ObjetoGeometrico {
    protected double raio;

    public Circulo(double centro1, double centro2, int raio){
        super(centro1, centro2);
        this.raio = raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }

    @Override
    public double area() {
        return Math.PI * (Math.pow(this.lado2, 2));
    }

    @Override
    public double perimetro() {
        return 2*Math.PI*this.getRaio();
    }
}
