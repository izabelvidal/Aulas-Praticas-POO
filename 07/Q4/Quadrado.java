public class Quadrado extends Retangulo {
    public Quadrado(double lado) {
        super(lado, lado);
    }

    @Overrride
    public String toString(){
        return "Lado: " + this.dimensao1
                + "\nAréa: " + this.area
                + "\nPerimetro: " this.perimetro;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null && obj instanceof Quadrado){
            Quadrado obj2 = (Quadrado)obj;
            if(this.calcularArea().equals(obj2.caclcularArea() && this.calcularPerimetro().equals(obj2.caclcularPerimetro())){
                return true;
            }
        }
        return false;
    }
}
