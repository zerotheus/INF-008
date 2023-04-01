public class App {
    public static void main(String[] args) throws Exception {
        MusicStore loja = new MusicStore();
        System.out.println(loja.displayHoursOfOperation());
        loja.setOwner("Roberto");
        System.out.println(loja.getOwner());
        System.out.println(loja.estaAbertaString());
        System.out.println(loja.toString());
        loja.setTitulos("null", "null");
        loja.setTitulos("Artista", "titulo");
        loja.listaTitulos();
    }
}
