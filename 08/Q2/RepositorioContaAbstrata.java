import java.util.ArrayList;

public class RepositorioContaAbstrata {
    private ArrayList<ContaAbstrata> arrayContas;

    public RepositorioContaAbstrata() {
        this.arrayContas = new ArrayList<>();
    }

    public void adicionarConta(ContaAbstrata conta){
        this.arrayContas.add(conta);
    }

    public void removerConta(ContaAbstrata conta){
        for(int i = 0; i < arrayContas.size(); i++){
            if(arrayContas.get(i).equals(conta)){
                arrayContas.remove(arrayContas.get(i));
            }
        }
    }
}
