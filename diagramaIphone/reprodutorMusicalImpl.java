package diagramaIphone;

public class reprodutorMusicalImpl extends iPhone implements reprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
        System.out.println("Música selecionada.");
    }
    
}
