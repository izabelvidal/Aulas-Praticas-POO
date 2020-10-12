public class Natal extends CartaoWeb {
    public Natal(String destinatario){
        super(destinatario);
    }

    @Override
    public String exibirMensagem() {
        return "Feliz Natal, " + this.getDestinatario() + "!";
    }
}
