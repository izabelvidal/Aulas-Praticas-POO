public class Triangulo implements ObjetoGeometrico, Cloneable {
    protected double lado1;
    protected double lado2;
    protected double lado3;
    protected double area;
    protected double perimetro;

    public Triangulo(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public Triangulo(Triangulo clone, double lado1Clone, double lado2Clone, double lado3Clone){
        this.lado1 = lado1Clone;
        this.lado2 = lado2Clone;
        this.lado3 = lado3Clone;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPerimetro() {
        return perimetro;
    }

    public void calcularPerimetro() {
       this.perimetro= (this.lado1 + this.lado2 + this.lado3);
    }

    public void calcularArea() {
        //metade do perimetro
        double metPerimetro = this.getPerimetro()/2;
        this.area = (Math.sqrt(metPerimetro* (metPerimetro - this.lado1) * (metPerimetro - this.lado2) * (metPerimetro - this.lado3)));
    }

    @Override
    public ObjetoGeometrico clone() {
        return (Triangulo) super.clone();
    }

    @Override
    public String toString(){
        return "Dimensão 1: " + this.lado1
                + "\nDimensão 2: " + this.lado2
                + "\nDimensão 3: " + this.lado3
                + "\nAréa: " + this.getArea()
                + "\nPerimetro: " + this.getPerimetro();
    }
}
