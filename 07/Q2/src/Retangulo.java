public class Retangulo extends ObjetoGeometrico {
    public Retangulo(double lado1, double lado2){
        super(lado1, lado2);
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
