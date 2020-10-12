public class Triangulo extends ObjetoGeometrico {
    public Triangulo(double dimensao1, double dimensao2, double dimensao3) {
        super(dimensao1, dimensao2, dimensao3);
        calcularPerimetro();
        calcularArea();
    }

    protected void calcularPerimetro() {
        this.setPerimetro(this.dimensao1 + this.dimensao2 + this.dimensao3);
    }
    /**
     *
     * implementação dos metódos da classe ObjetoGeometrico
     * removi a tag @override
     *
     * */
    protected void calcularArea() {
        //metade do perimetro
        double metPerimetro = this.getPerimetro()/2;
        this.setArea(Math.sqrt(metPerimetro* (metPerimetro - this.dimensao1) * (metPerimetro - this.dimensao2) * (metPerimetro - this.dimensao3)));
    }

    /**
     *
     * método sobrescrita do método toString que pertence à classe Object
     *
     * */
    @Override
    public String toString(){
        return "Dimensão 1: " + this.dimensao1
                + "\nDimensão 2: " + this.dimensao2
                + "\nDimensão 3: " + this.dimensao3
                + "\nAréa: " + this.area
                + "\nPerimetro: " + this.perimetro;
    }
}
