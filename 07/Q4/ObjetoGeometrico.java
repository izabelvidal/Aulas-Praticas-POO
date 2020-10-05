public class ObjetoGeometrico {
    protected double dimensao1;
    protected double dimensao2;
    protected double dimensao3;
    protected double area;
    protected double perimetro;

    //inincalizar o objeto com 2 lados
    public ObjetoGeometrico(double dimensao1, double dimensao2){
        this.dimensao1 = dimensao1;
        this.dimensao2 = dimensao2;
    }

    //inicializar o objeto com 3 lados
    public ObjetoGeometrico(double dimensao1, double dimensao2, double dimensao3){
        this.dimensao1 = dimensao1;
        this.dimensao2 = dimensao2;
        this.dimensao3 = dimensao3;
    }



    protected void calcularArea(){
        this.setArea(0);
    }

    protected void calcularPerimetro(){
        this.setPerimetro(0);
    }

    public double getDimensao1() {
        return dimensao1;
    }

    protected void setDimensao1(double dimensao1) {
        this.dimensao1 = dimensao1;
    }

    public double getDimensao2() {
        return dimensao2;
    }

    protected void setDimensao2(double dimensao2) {
        this.dimensao2 = dimensao2;
    }

    public double getArea() {
        return area;
    }

    protected void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    protected void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public String toString(){
        return "Dimensão 1: " + this.dimensao1
                + "\nDimensão2: " + this.dimensao2
                + "\nAréa: " + this.area
                + "\nPerimetro: " this.perimetro;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null && obj instanceof ObjetoGeometrico){
            ObjetoGeometrico obj2 = (ObjetoGeometrico)obj;
            if(this.calcularArea().equals(obj2.caclcularArea() && this.calcularPerimetro().equals(obj2.caclcularPerimetro())){
                return true;
            }
        }
        return false;
    }
}
