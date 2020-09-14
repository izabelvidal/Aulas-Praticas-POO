import java.util.Scanner;

public class CoffeeMachine {
    double moeda;
    double cafe;
    double chocolate;
    double capuccino;
    double bebida;

    public CoffeeMachine(){
        this.cafe = 2;
        this.chocolate = 5;
        this.capuccino = 3;
    }

    public void introduzirMoeda(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza uma moeda: ");
        this.moeda = sc.nextDouble();
        escolherBebida();
    }

    public void escolherBebida(){
        System.out.print("Escolha sua bebida: ");
        switch(int opcao){
            case opcao == 1:
                botaoCafe();
            case 2:
                botaoChocolate();;
        }
    }

    public void botaoCafe(){
        bebida = cafe;
    }

    public void botaoChocolate(){
        bebida = chocolate;
    }

    public void botaoCapuccino(){
        bebida = capuccino;
    }

    public void prepararBebida(){
        if(moeda >= bebida){
            if(){}
        }else{
            System.out.print("Dinheiro insuficiente!");
        }
    }

    public void devolverTroco(){
        double troco = this.moeda - bebida;
        this.moeda = 0;
    }
}
