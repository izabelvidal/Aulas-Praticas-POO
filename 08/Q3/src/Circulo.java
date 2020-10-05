public class Circulo extends ObjetoGeometrico{
    private double raio;
    public Circulo(double centro, double raio) {
        super(centro, raio);
        this.raio = raio - centro;
        this.calcularArea();
        this.calcularPerimetro();
    }

    @Override
    protected void calcularArea() {
        this.setArea(Math.PI * Math.pow(this.raio, 2));
    }

    @Override
    protected void calcularPerimetro() {
        this.setPerimetro(2* Math.PI * raio);
    }

    @Override
    public String toString(){
        return "Centro: " + this.dimensao1
                + "\nRaio: " + this.dimensao2
                + "\nAréa: " + this.area
                + "\nPerimetro: " + this.perimetro;
    }
}
