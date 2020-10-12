public class Main {

    public static void main(String[] args) {
        ObjetoGeometrico circulo = new Circulo(2, 8);
        ObjetoGeometrico retangulo = new Retangulo(4, 16);
        ObjetoGeometrico triangulo = new Triangulo(6,6,6);
        ObjetoGeometrico quadrado = new Quadrado(8);
        ObjetoGeometrico trianguloEquilatero = new TrianguloEquilatero(95);
        ObjetoGeometrico trianguloEscaleno = new TrianguloEscaleno(17, 15, 93);
        ObjetoGeometrico trianguloIsosceles = new TrianguloIsosceles(26, 11);

        circulo.calcularArea();
        circulo.getPerimetro();
        System.out.println(circulo.getArea());
        System.out.println(circulo.getPerimetro());

        retangulo.calcularArea();
        retangulo.calcularPerimetro();
        System.out.println(retangulo.getArea());
        System.out.println(retangulo.getPerimetro());

        triangulo.calcularArea();
        triangulo.calcularPerimetro();
        System.out.println(triangulo.getArea());
        System.out.println(triangulo.getPerimetro());

        quadrado.calcularArea();
        quadrado.calcularPerimetro();
        System.out.println(quadrado.getArea());
        System.out.println(quadrado.getPerimetro());

        trianguloEquilatero.calcularArea();
        trianguloEquilatero.calcularPerimetro();
        System.out.println(trianguloEquilatero.getArea());
        System.out.println(trianguloEquilatero.getPerimetro());

        trianguloEscaleno.calcularArea();
        trianguloEscaleno.calcularPerimetro();
        System.out.println(trianguloEscaleno.getArea());
        System.out.println(trianguloEscaleno.getPerimetro());

        trianguloIsosceles.calcularArea();
        trianguloIsosceles.calcularPerimetro();
        System.out.println(trianguloIsosceles.getArea());
        System.out.println(trianguloIsosceles.getPerimetro());

        //CLONAR
        System.out.println(circulo.clone(circulo));
        System.out.println();
        System.out.println(retangulo.clone(retangulo));
        System.out.println();
        System.out.println(triangulo.clone(triangulo));
        System.out.println();
        System.out.println(quadrado.clone(quadrado));
        System.out.println();
        System.out.println(trianguloEquilatero.clone(trianguloEquilatero));
        System.out.println();
        System.out.println(trianguloEscaleno.clone(trianguloEscaleno));
        System.out.println();
        System.out.println(trianguloIsosceles.clone(trianguloIsosceles));
    }
}
