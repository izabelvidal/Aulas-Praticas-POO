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

    public double getCentro() {
        return centro;
    }

    public double getRaio() {
        return raio;
    }

    public void setCentro(double centro) {
        this.centro = centro;
    }

    public void setRaio(double raio) {
        this.raio = raio;
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
    public ObjetoGeometrico clone(ObjetoGeometrico o) {
        ObjetoGeometrico novo = new Circulo(this.centro, this.raio);
        ((Circulo) novo).setCentro(getCentro());
        ((Circulo) novo).setRaio(getRaio());
        return novo;
    }

    @Override
    public String toString(){
        return "Centro: " + this.centro
                + "\nRaio: " + this.raio
                + "\nAréa: " + this.getArea()
                + "\nPerimetro: " + this.getPerimetro();
    }
}
