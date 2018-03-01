public class Kursist {

    private String kursistNavn;
    private int kursistNr;
    private int kursistAlder;
    private String kursistKlasse;
    private String kursistSkole;

    Kursist(String kursistKlasse, String kursistNavn, String kursistSkole, int kursistAlder, int kursistNr) {

        this.kursistAlder = kursistAlder;
        this.kursistKlasse = kursistKlasse;
        this.kursistNavn = kursistNavn;
        this.kursistNr = kursistNr;
        this.kursistSkole = kursistSkole;
    }

    public String getKursistNavn() {
        return kursistNavn;
    }

    public void setKursistNavn(String kursistNavn) {
        this.kursistNavn = kursistNavn;
    }

    public int getKursistNr() {
        return kursistNr;
    }

    public void setKursistNr(int kursistNr) {
        this.kursistNr = kursistNr;
    }

    public int getKursistAlder() {
        return kursistAlder;
    }

    public void setKursistAlder(int kursistAlder) {
        this.kursistAlder = kursistAlder;
    }

    public String getKursistKlasse() {
        return kursistKlasse;
    }

    public void setKursistKlasse(String kursistKlasse) {
        this.kursistKlasse = kursistKlasse;
    }

    public String getKursistSkole() {
        return kursistSkole;
    }

    public void setKursistSkole(String kursistSkole) {
        this.kursistSkole = kursistSkole;
    }
}
