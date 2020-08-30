public class Main {

    public static void main(String[] args) {
        Lampada lamp = new Lampada();

        lamp.mostraEstado();
        System.out.printf("A lampada foi acesa %d vezes.\n", lamp.mostraQuantasVezesFoiAcesa());

        lamp.acende();
        lamp.mostraEstado();
        System.out.printf("A lampada foi acesa %d vezes.\n", lamp.mostraQuantasVezesFoiAcesa());

        lamp.apaga();
        lamp.mostraEstado();
        
        lamp.acende();
        lamp.mostraEstado();
        System.out.printf("A lampada foi acesa %d vezes.\n", lamp.mostraQuantasVezesFoiAcesa());
    }
}
