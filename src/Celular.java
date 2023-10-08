import DAO.AparelhoTelefonico;
import DAO.NavegadorInternet;
import DAO.ReprodutorMusical;

public class Celular implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar() {
        System.out.println("Ligando!");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando!");
    }

    @Override
    public void exibirPagina(String pagina) {
        System.out.println("Exibindo a página! " + pagina);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando!");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando!");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada!");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada! " + musica);
    }
}
