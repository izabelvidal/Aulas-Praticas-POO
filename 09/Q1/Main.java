public class Main {

    public static void main(String[] args) {
        IOperacaoMatematica adicao = new Adicao();
        IOperacaoMatematica subtracao = new Subtracao();
        IOperacaoMatematica multiplicacao = new Multiplicacao();
        IOperacaoMatematica divisao = new Divisao();

        double numeroA = 2;
        double numeroB = 6;

        System.out.println(adicao.calcular(numeroA, numeroB));
        System.out.println(subtracao.calcular(numeroA, numeroB));
        System.out.println(multiplicacao.calcular(numeroA, numeroB));
        System.out.println(divisao.calcular(numeroA, numeroB));

    }
}
