public class Main {

    private boolean tilmeldt;
    private boolean aldersgrænse;

    public static void main(String[] args) {

        Kurser k1 = new Kurser("Mandag", "Parkour", "10:30");
        Underviser u1 = new Underviser("Michael", "1.04");
        Kursist ku1 = new Kursist("6.A", "Peter", "Herluflille", 15, 11223344);

        System.out.println("Kursus: " + k1.getKursusNavn());
        System.out.println("Holdes: " + k1.getMødetidspunkt() + " " + k1.getKursusDag());




    }
}
