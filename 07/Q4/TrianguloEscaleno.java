public class TrianguloEscaleno extends Triangulo {
    public TrianguloEscaleno(double dimensao1, double dimensao2, double dimensao3) {
        super(dimensao1, dimensao2, dimensao3);
    }

    @Overrride
    public String toString(){
        return "Lado 1: " + this.dimensao1
                + "\nLado2: " + this.dimensao2
                + "\nLado3: " + this.dimensao3
                + "\nAréa: " + this.area
                + "\nPerimetro: " this.perimetro;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null && obj instanceof TrianguloEscaleno){
            TrianguloEscaleno obj2 = (TrianguloEscaleno)obj;
            if(this.calcularArea().equals(obj2.caclcularArea() && this.calcularPerimetro().equals(obj2.caclcularPerimetro())){
                return true;
            }
        }
        return false;
    }
}
