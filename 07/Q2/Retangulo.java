public class Retangulo extends ObjetoGeometrico{
    public Retangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    protected void calcularArea() {
        this.setArea(this.dimensao1 * this.dimensao2);
    }

    @Override
    protected void calcularPerimetro() {
        this.setPerimetro(2* this.dimensao1 * this.dimensao2);
    }

}
