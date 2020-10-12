public class Main {

    public static void main(String[] args) {
        ObjetoGeometrico circulo = new Circulo(2, 8);
        ObjetoGeometrico retangulo = new Retangulo(4, 16);
        ObjetoGeometrico triangulo = new Triangulo(6,6,6);
        ObjetoGeometrico quadrado = new Quadrado(8);
        ObjetoGeometrico trianguloEquilatero = new TrianguloEquilatero(10);
        ObjetoGeometrico trianguloEscaleno = new TrianguloEscaleno(12, 14, 16);
        ObjetoGeometrico trianguloIsosceles = new TrianguloIsosceles(12, 14);

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

    }
}
