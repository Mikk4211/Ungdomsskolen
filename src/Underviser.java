public class Underviser {

    private String underviserNavn;
    private String lokale;

    Underviser(String underviserNavn, String lokale){

        this.underviserNavn = underviserNavn;
        this.lokale = lokale;
    }

    public String getLokale() {
        return lokale;
    }

    public void setLokale(String lokale) {
        this.lokale = lokale;
    }

    public String getUnderviserNavn() {
        return underviserNavn;
    }

    public void setUnderviserNavn(String underviserNavn) {
        this.underviserNavn = underviserNavn;
    }




}
