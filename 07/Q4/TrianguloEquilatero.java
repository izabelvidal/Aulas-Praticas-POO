public class TrianguloEquilatero extends Triangulo {
    public TrianguloEquilatero(double lado) {
        super(lado, lado, lado);
    }

    @Overrride
    public String toString(){
        return "Lados: " + this.dimensao1
                + "\nAréa: " + this.area
                + "\nPerimetro: " + this.perimetro;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null && obj instanceof TrianguloEquilatero){
            TrianguloEquilatero obj2 = (TrianguloEquilatero)obj;
            if(this.calcularArea().equals(obj2.caclcularArea() && this.calcularPerimetro().equals(obj2.caclcularPerimetro())){
                return true;
            }
        }
        return false;
    }
}
