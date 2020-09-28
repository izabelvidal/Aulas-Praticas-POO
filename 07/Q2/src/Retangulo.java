public class Retangulo extends ObjetoGeometrico {
    public Retangulo(double lado1, double lado2){
        super(lado1, lado2);
    }

    @Override
    public void setLado1(double lado1) {
        super.setLado1(lado1);
    }

    @Override
    public void setLado2(double lado2) {
        super.setLado2(lado2);
    }

    @Override
    public double getLado1() {
        return super.getLado1();
    }

    @Override
    public double getLado2() {
        return super.getLado2();
    }

    @Override
    public double perimetro() {
        return (2*lado1)+(2*lado2);
    }

    @Override
    public double area() {
        return lado1*lado2;
    }
}
