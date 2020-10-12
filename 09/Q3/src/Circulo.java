public class Circulo implements ObjetoGeometrico{
    private double centro;
    private double raio;
    private double perimetro;
    private double area;

    public Circulo(double centro, double raio) {
        this.centro = centro;
        this.raio = raio - centro;
        this.calcularArea();
        this.calcularPerimetro();
    }

    public double getArea(){
        return this.area;
    }

    public double getPerimetro(){
        return this.perimetro;
    }

    public void calcularArea() {
        this.area = (Math.PI * Math.pow(this.raio, 2));
    }
    public void calcularPerimetro() {
        this.perimetro = (2* Math.PI * raio);
    }

    @Override
    public String toString(){
        return "Centro: " + this.centro
                + "\nRaio: " + this.raio
                + "\nAréa: " + this.getArea()
                + "\nPerimetro: " + this.getPerimetro();
    }
}
