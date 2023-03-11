public class MusicStore {
    private int openTime = 9;
    private int closeTime = 21;
    private String owner;

    public MusicStore() {
        setOwner("Sem dono");
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void displayHourofOperation() {
        System.out.println("Diaramente das " + openTime + ":00 as " + closeTime + ":00");
    }

    @Override
    public String toString() {
        return "MusicStore abre as " + openTime + ", fecha as " + closeTime + ", dono " + owner + ".";
    }

}
