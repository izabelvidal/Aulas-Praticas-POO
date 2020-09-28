public class Triangulo extends ObjetoGeometrico{
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3){
        super(lado1, lado2);
        this.lado3 = lado3;
    }

    @Override
    public void setLado1(double lado1) {
        super.setLado1(lado1);
    }

    @Override
    public void setLado2(double lado2) {
        super.setLado2(lado2);
    }
}
