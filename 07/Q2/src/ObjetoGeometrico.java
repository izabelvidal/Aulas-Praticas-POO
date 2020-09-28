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
        return this.lado1;
    }

    public double getLado2() {
        return this.lado2;
    }

    public double area(){
        return 0;
    }

    public double perimetro(){
        return 0;
    }

    public String toString(){
        return "Lado 1: " + this.lado1 +
                "\n Lado 2: " + this.lado2;
    }
}
