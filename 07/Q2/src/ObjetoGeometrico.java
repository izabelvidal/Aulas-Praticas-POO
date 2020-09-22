public class ObjetoGeometrico {
    protected double lado1;
    protected double lado2;

    public ObjetoGeometrico(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void area(){}

    public void perimetro(){}

    public String toString(){
        return "Lado 1: " + this.lado1 +
                "\n Lado 2: " + this.lado2;
    }
}
