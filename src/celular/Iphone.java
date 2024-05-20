package celular;
import ligacoes.AparelhoTelefonico;
import musicas.ReprodutorMusical;
import navegador.NavegadorInternet;

public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {
    public void tocar(){
        System.out.println("O celular está tocando uma musica.");
    }

    public void pausar(){
        System.out.println("A mucica foi pausada.");
    }

    public void selecionarMusica(String nomeMusica){
        System.out.println("A mucica " + nomeMusica + " está tocando.");
    }

    public void exibirPagina(String nomePagina){
        System.out.println("A pagina "+ nomePagina + " está aberta.");
    }

    public void adicionarNovoAba(){
        System.err.println("Nova aba adicionada");
    }

    public void atualzarPagina(){
        System.out.println("A pagina da web foi atualizada.");
    }

    public void ligar(String number){
        System.out.println("Ligando para o numero "+ number);
    }

    public void atender(){
        System.out.println("Atendendo o telefone");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz");
    }


}
