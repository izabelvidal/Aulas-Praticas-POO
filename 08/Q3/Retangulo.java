public class Retangulo extends ObjetoGeometrico{
    public Retangulo(double base, double altura) {
        super(base, altura);
    }

    protected void calcularArea() {
        this.setArea(this.dimensao1 * this.dimensao2);
    }
    /**
     *
     * implementação dos metódos da classe ObjetoGeometrico
     * removi a tag @Override
     *
     * */
    protected void calcularPerimetro() {
        this.setPerimetro(2* this.dimensao1 * this.dimensao2);
    }


    /**
     *
     * método sobrescrita do método toString que pertence à classe Object
     *
     * */
    @Override
    public String toString(){
        return "Base: " + this.dimensao1
                + "\nAltura: " + this.dimensao2
                + "\nAréa: " + this.area
                + "\nPerimetro: " + this.perimetro;
    }
}
