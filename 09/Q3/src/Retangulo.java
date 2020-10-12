public class Retangulo implements ObjetoGeometrico{
    protected  double base;
    protected double altura;
    protected double area;
    protected double perimetro;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPerimetro() {
        return perimetro;
    }

    public void calcularArea() {
        this.area = this.base * this.altura;
    }

    public void calcularPerimetro() {
        this.perimetro = (2* (this.base * this.altura));
    }

    @Override
    public String toString(){
        return "Base: " + this.base
                + "\nAltura: " + this.altura
                + "\nAréa: " + this.getArea()
                + "\nPerimetro: " + this.getPerimetro();
    }
}
