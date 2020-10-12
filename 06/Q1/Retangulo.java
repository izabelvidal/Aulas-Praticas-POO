public class Retangulo {
    protected double largura;
    protected double altura;

    Retangulo(){
        this.altura = 1;
        this.largura = 1;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura){
        if(altura > 0.0 && altura <= 20.0){
            this.altura = altura;
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura){
        if(largura > 0.0 && largura <= 20.0){
            this.largura = largura;
        }
    }

    public double calcularPerimetro(){
        return ((this.getLargura()*2) + (this.getAltura()*2));
    }

    public double calcularArea(){
        return ((this.getLargura()*this.getAltura()));
    }
}
