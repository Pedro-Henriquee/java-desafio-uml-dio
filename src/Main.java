// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Celular iphone = new Celular();

        //Aparelho telefônico
        iphone.iniciarCorreioVoz();
        iphone.ligar();
        iphone.atender();

        //Reprodutor musical
        iphone.selecionarMusica("Just dance!");
        iphone.pausar();
        iphone.tocar();

        //Navegador internet
        iphone.adicionarNovaAba();
        iphone.exibirPagina("Youtube");
        iphone.atualizarPagina();
    }
}