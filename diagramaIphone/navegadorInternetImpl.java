package diagramaIphone;

public class navegadorInternetImpl extends iPhone implements navegadorInternet {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
    
}
