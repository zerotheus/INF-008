public class Title {
    private String titulo;
    private String artista;

    public Title() {
        setArtista("Sem artista");
        setTitulo("Sem titulo");
    }

    public Title(String artista, String titulo) {
        setTitulo(titulo);
        setArtista(artista);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Artista: " + artista + ".\n";
    }

}
