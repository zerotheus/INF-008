import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MusicStore {
    private int openHour;
    private int closeHour;
    private String owner;
    private List<Titulos> titulos;

    public MusicStore() {
        this.openHour = 9;
        this.closeHour = 21;
        this.owner = "Sem dono";
        titulos = new ArrayList<Titulos>();
    }

    public String displayHoursOfOperation() {
        return "A loja abre as " + getOpenHour() + " e fecha as " + getCloseHour();
    }

    public int getOpenHour() {
        return openHour;
    }

    public int getCloseHour() {
        return closeHour;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    private int getHourOfDay() {
        Calendar calendar = Calendar.getInstance();
        return calendar.HOUR_OF_DAY;
    }

    private boolean estaAberta() {
        int hora = getHourOfDay();
        if (hora > getOpenHour() && hora < getCloseHour()) {
            return true;
        }
        return false;
    }

    public String estaAbertaString() {
        if (estaAberta()) {
            return "Esta aberta";
        } else {
            return "Esta fechada";
        }
    }

    public List<Titulos> getTitulos() {
        return titulos;
    }

    public void listaTitulos() {
        for (int i = 0; i < titulos.size(); i++) {
            System.out.println(
                    "Artista: " + this.titulos.get(i).getArtista() + "Musica" + this.titulos.get(i).getTitulo() + "\n");
        }
    }

    public void setTitulos(String artista, String titulo) {
        Titulos novoTitulo = new Titulos(artista, titulo);
        titulos.add(novoTitulo);
    }

    public String toString() {
        return "Dono: " + getOwner() + ", abre:" + getOpenHour() + ", fecha: " + getCloseHour();
    }

}
