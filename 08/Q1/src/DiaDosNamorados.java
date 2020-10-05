public class DiaDosNamorados extends CartaoWeb {
    public DiaDosNamorados(String destinatario){
        super(destinatario);
    }

    @Override
    public String exibirMensagem() {
        return "Feliz Dia dos Namorados!!!";
    }
}

