public class Title {
    private String titulo;
    private String artista;

    public Title() {
        setartista("Sem artista");
        setTitulo("Sem titulo");
    }

    public Title(String artista, String titulo) {
        setTitulo(titulo);
        setartista(artista);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getartista() {
        return artista;
    }

    public void setartista(String artista) {
        this.artista = artista;
    }

}
