public class Triangulo extends ObjetoGeometrico{
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3){
        super(lado1, lado2);
        this.lado3 = lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getLado3() {
        return this.lado3;
    }

    @Override
    public double perimetro() {
        return this.getLado1()+this.getLado2()+this.getLado3();
    }

    @Override
    public double area() {
        double metadePerimetro = this.perimetro()/2;
        double subA = metadePerimetro - this.lado1;
        double subB = metadePerimetro - this.lado2;
        double subC = metadePerimetro - this.lado3;
        double mult = metadePerimetro*subA*subB*subC;
        return Math.sqrt(mult);
    }
}
