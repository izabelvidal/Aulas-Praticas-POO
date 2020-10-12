import java.util.Scanner;

public class CoffeeMachine {
    Scanner sc = new Scanner(System.in);
    double moeda;
    double valor;
    double cafe;
    double chocolate;
    double capuccino;
    double bebida;


    public CoffeeMachine(){
        this.valor = 0;
        this.cafe = 2;
        this.chocolate = 5;
        this.capuccino = 3;
    }

    public boolean validarMoeda(){
        if(this.moeda == 0.05 || this.moeda == 0.10 || this.moeda == 0.25 ||
                this.moeda == 0.50 || this.moeda == 1){
            return true;
        }
        return false;
    }

    public void introduzirMoeda(){
        System.out.print("Quantas Moedas Deseja Inserir? ");
        int entrada = sc.nextInt();
        int i = 0;
        while(i < entrada) {
            System.out.print("Insira uma moeda: ");
            this.moeda = sc.nextDouble();
            if (validarMoeda()) {
                this.valor += moeda;
            } else {
                System.out.print("Moeda Inválida!!!");
                System.exit(0);
            }
            i++;
        }
        escolherBebida();
    }


    public void escolherBebida(){
        System.out.println("escolhe sua bebida: ");
        System.out.println("1 - cafe");
        System.out.println("2 - chocolate");
        System.out.println("3 - capuccino");

        int opcao = sc.nextInt();
        if(opcao == 1){
            botaoCafe();
        }else if(opcao == 2){
            botaoChocolate();
        }else if(opcao == 3){
            botaoCapuccino();
        }else{
            System.out.println("Opção inválida.");
        }
    }

    public void botaoCafe(){
        this.bebida = cafe;
        prepararBebida();
    }

    public void botaoChocolate(){
        this.bebida = chocolate;
        prepararBebida();
    }

    public void botaoCapuccino(){
        this.bebida = capuccino;
        prepararBebida();
    }

    public double eSuficiente(){
        return this.valor - this.bebida;
    }

    public void prepararBebida(){
        if(this.valor >= this.bebida){
            System.out.println("Valor: " + this.valor);
            System.out.println("Bebida Pronta!!!");
            System.out.printf("Troco: %.2f", devolverTroco());

        }else{
            System.out.println(eSuficiente());
            introduzirMoeda();

        }
    }

    public  double devolverTroco(){
        double troco = this.valor - this.bebida;
        this.valor = 0;
        return troco;
    }
}
