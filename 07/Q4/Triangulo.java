public class Triangulo extends ObjetoGeometrico {
    public Triangulo(double dimensao1, double dimensao2, double dimensao3) {
        super(dimensao1, dimensao2, dimensao3);
        calcularPerimetro();
        calcularArea();
    }

    @Override
    protected void calcularPerimetro() {
        this.setPerimetro(this.dimensao1 + this.dimensao2 + this.dimensao3);
    }


    @Override
    protected void calcularArea() {
        //metade do perimetro
        double metPerimetro = this.getPerimetro()/2;
        this.setArea(Math.sqrt(metPerimetro* (metPerimetro - this.dimensao1) * (metPerimetro - this.dimensao2) * (metPerimetro - this.dimensao3)));
    }

    @Overrride
    public String toString(){
        return "Dimensão 1: " + this.dimensao1
                + "\nDimensão 2: " + this.dimensao2
                + "\nDimensão 3: " + this.dimensao3
                + "\nAréa: " + this.area
                + "\nPerimetro: " this.perimetro;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null && obj instanceof Triangulo){
            Triangulo obj2 = (Triangulo)obj;
            if(this.calcularArea().equals(obj2.caclcularArea() && this.calcularPerimetro().equals(obj2.caclcularPerimetro())){
                return true;
            }
        }
        return false;
    }


}
