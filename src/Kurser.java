public class Kurser {

    public String kursusNavn;
    public String kursusDag;
    public String mødetidspunkt;

    Kurser(String kursusDag, String kursusNavn, String mødetidspunkt){

        this.kursusDag = kursusDag;
        this.kursusNavn = kursusNavn;
        this.mødetidspunkt = mødetidspunkt;
    }

    public String getMødetidspunkt() {
        return mødetidspunkt;
    }

    public void setMødetidspunkt(String mødetidspunkt) {
        this.mødetidspunkt = mødetidspunkt;
    }

    public String getKursusNavn() {
        return kursusNavn;
    }

    public void setKursusNavn(String kursusNavn) {
        this.kursusNavn = kursusNavn;
    }

    public String getKursusDag() {
        return kursusDag;
    }

    public void setKursusDag(String kursusDag) {
        this.kursusDag = kursusDag;
    }



}
