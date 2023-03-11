public class App { // as variaveis estao hardcoded por conta de nao ter nada visual
    public static void main(String[] args) {
        MusicStore lojadeMusica = new MusicStore();
        System.out.println(lojadeMusica.getOpenCloseMessage());
        System.out.println(lojadeMusica.toString());
        lojadeMusica.setTitulos("Java", "Lang", 0);
        lojadeMusica.setTitulos("Null", "Pointer", 1);
        lojadeMusica.setTitulos("Exception", "Cannot", 2);
        lojadeMusica.setTitulos("Invoke", "Be cause is null null", 3);
        System.out.println(lojadeMusica.displayMusictitles());

    }
}
