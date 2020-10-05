public class TrianguloIsosceles extends Triangulo {
    public TrianguloIsosceles(double lado1, double lado2) {
        super(lado1, lado1, lado2);
    }

    @Overrride
    public String toString(){
        return "Lado 1: " + this.dimensao1
                + "\nLado2: " + this.dimensao2
                + "\nAréa: " + this.area
                + "\nPerimetro: " this.perimetro;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null && obj instanceof TrianguloIsosceles){
            TrianguloIsosceles obj2 = (TrianguloIsosceles)obj;
            if(this.calcularArea().equals(obj2.caclcularArea() && this.calcularPerimetro().equals(obj2.caclcularPerimetro())){
                return true;
            }
        }
        return false;
    }
}
