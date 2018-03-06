

public class Main {
    public static void main(String[] args) {

        Kurser k1 = new Kurser("Mandag", "Parkour", "10:30", Type.FYSISK);
        Underviser u1 = new Underviser("Michael", "1.04");
        Kursist ku1 = new Kursist("6.A", "Peter", "Herluflille Skole", 15, 11223344);
        Kursist ku2 = new Kursist("6.A", "Magnus", "Herluflille Skole", 14, 22334455);

        k1.tilmeldKursist(ku1);
        k1.tilmeldKursist(ku2);


        System.out.println("Kursus: " + k1.getKursusNavn() + " er en " + k1.getType() + " aktivitet.");
        System.out.println("Holdes: " + k1.getMødetidspunkt() + " " + k1.getKursusDag());
        System.out.println("Hertil er " + ku1.getKursistNavn() + " og " + ku2.getKursistNavn() + " fra " + ku1.getKursistKlasse() + " på " + ku1.getKursistSkole() + " tilmeldt. Dette undervises af " + u1.getUnderviserNavn() + " i " + u1.getLokale() + ".");
    }
}
