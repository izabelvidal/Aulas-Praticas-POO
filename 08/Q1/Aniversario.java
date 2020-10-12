public class Aniversario extends CartaoWeb {
    public Aniversario(String destinatario){
        super(destinatario);
    }

    @Override
    public String exibirMensagem() {
        return "Feliz Aniversário, "  + this.getDestinatario() + "!";
    }
}
