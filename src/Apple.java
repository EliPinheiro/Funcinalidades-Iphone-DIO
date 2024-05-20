import celular.Iphone;

public class Apple {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        String appAberto = "navegador";


        if (appAberto.equals("ligação")) {
            iphone.atender();
            iphone.ligar("31971733043");
            iphone.iniciarCorreioVoz();
        }
        else if(appAberto.equals("reprodutormusical")){
            iphone.tocar();
            iphone.pausar();
            iphone.selecionarMusica("U homem na estrada");
        }
        else if(appAberto.equals("navegador")){
            iphone.adicionarNovoAba();
            iphone.exibirPagina("google");
            iphone.atualzarPagina();
        }
    }
}
