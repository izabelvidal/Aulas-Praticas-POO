public class Circulo extends ObjetoGeometrico {
    protected double raio;

    public Circulo(double centro1, double centro2, int raio){
        super(centro1, centro2);
        this.raio = raio;
    }

    //circunferencia
    @Override
    public void setLado1(double centro1) {
        super.setLado1(centro1);
    }

    //raio
    @Override
    public void setLado2(double centro2) {
        super.setLado2(centro2);
    }

    @Override
    public double getLado1() {
        return super.getLado1();
    }

    @Override
    public double getLado2() {
        return super.getLado2();
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double area() {
        return Math.PI * (Math.pow(this.lado2, 2));
    }

    @Override
    public double perimetro() {
        return 2*Math.PI*this.raio;
    }
}
