public class Kurser {

    public String kursusNavn;
    public String kursusDag;
    public String mødetidspunkt;
    private Kursist[] kursistArray;
    private int tilmeldte = 0;
    private int maxtilmeldte;
    private Kursist kursist;
    private Type type;



    public Kurser(String kursusDag, String kursusNavn, String mødetidspunkt, Type type){
        this.kursusDag = kursusDag;
        this.kursusNavn = kursusNavn;
        this.mødetidspunkt = mødetidspunkt;
        kursistArray = new Kursist[10];
        this.kursist = kursist;
        this.type = type;

    }

    public String tilmeldKursist(Kursist kursist){
        kursistArray[tilmeldte] = kursist;
        tilmeldte++;
        System.out.println(kursist.getKursistNavn() + " er oprettet på " + kursusNavn + " som deltager nr. " + tilmeldte + "." );
        //if ()

        return "";
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
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
