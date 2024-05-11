import model.entities.IPhone;

public class ComponeteIPhone {
    public static void main(String[] args) {
        IPhone iPhone1 = new IPhone();

        //Funções de Reprodutor de Musica
        iPhone1.selecionarMusica();
        iPhone1.tocar();
        iPhone1.pausar();

        //Funções de Aparelho Telefônico
        iPhone1.ligar();
        iPhone1.atender();
        iPhone1.iniciarCorrerioVoz();

        //Funções de Navegador de Internet
        iPhone1.exibirPagina();
        iPhone1.atualizarPagina();
        iPhone1.adicionarNovaAba();
    }
}
