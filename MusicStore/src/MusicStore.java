import java.util.Calendar;

public class MusicStore {
    private int openTime;
    private int closeTime;
    private String owner;
    private Title[] titulos = new Title[4];

    public Title[] getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulo, String artista, int pos) {
        if (pos < 0 || pos > 4) {
            return;
        }
        Title tituloTemporario = new Title();
        tituloTemporario.setArtista(artista);
        tituloTemporario.setTitulo(titulo);

        titulos[pos] = tituloTemporario;

    }

    public MusicStore() {
        setOwner("Sem dono");
        setOpenTime(9);
        setCloseTime(21);
        // this.titulos = new Title();
    }

    public int getOpenTime() {
        return openTime;
    }

    public void setOpenTime(int openTime) {
        this.openTime = openTime;
    }

    public int getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(int closeTime) {
        this.closeTime = closeTime;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    private int getHour() {
        Calendar calendario = Calendar.getInstance(); // classe que tem o metodo de retorno da sua regiao do planeta;
        return calendario.get(Calendar.HOUR_OF_DAY); // retorna um inteiro com a hora do dia
    }

    private boolean isOpen() {
        int hora = getHour();
        if (hora > 8 && hora < 22) {
            return true;
        }
        return false;
    }

    public String getOpenCloseMessage() {
        if (isOpen()) {
            return "A loja esta aberta";
        }
        return "A loja esta fechada";
    }

    public String displayMusictitles() {
        System.out.println("titulos disponiveis\n");
        String retorno = "";
        for (int i = 0; i < 4; i++) {
            retorno = retorno + titulos[i].toString();
        }
        return retorno;
    }

    public void displayHourofOperation() {
        System.out.println("Diaramente das " + openTime + ":00 as " + closeTime + ":00");
    }

    @Override
    public String toString() {
        return "MusicStore abre as " + openTime + ", fecha as " + closeTime + ", dono " + owner + ".";
    }

}
