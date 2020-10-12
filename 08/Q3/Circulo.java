public class Circulo extends ObjetoGeometrico{
    private double raio;
    public Circulo(double centro, double raio) {
        super(centro, raio);
        this.raio = raio - centro;
        this.calcularArea();
        this.calcularPerimetro();
    }


    protected void calcularArea() {
        this.setArea(Math.PI * Math.pow(this.raio, 2));
    }
    /**
     *
     * implementação dos metódos da classe ObjetoGeometrico
     * removi a tag @override
     *
     * */
    protected void calcularPerimetro() {
        this.setPerimetro(2* Math.PI * raio);
    }

    /**
     *
     * método sobrescrita do método toString que pertence à classe Object
     *
     * */
    @Override
    public String toString(){
        return "Centro: " + this.dimensao1
                + "\nRaio: " + this.dimensao2
                + "\nAréa: " + this.area
                + "\nPerimetro: " + this.perimetro;
    }
}
