import java.util.*;

public class osoba {

    // static public String imeIPrezime(String ime, String prezime){}

    static public void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String ime = "Mateo";
        String prezime = "Maric";
        int dan = 17;
        int mjesec = 07;
        int godina = 2001;

        System.out.println("Upisite index broj podatka koje zelite prikazati na ekranu:");
        System.out.println("1. Ime");
        System.out.println("2. Prezime");
        System.out.println("3. Dan rodenja");
        System.out.println("4. Mjesec rodenja");
        System.out.println("5. Godina rodenja");
        System.out.println("0. Cancel");

        int odabir = sc.nextInt();

        while (odabir > 0) {

            switch (odabir) {
                case 1:
                    System.out.println("Korisnikovo ime je: " + ime);
                    break;
                case 2:
                    System.out.println("Korisnikovo prezime je: " + prezime);
                    break;
                case 3:
                    System.out.println("Korisnikov dan roenja je: " + dan);
                    break;
                case 4:
                    System.out.println("Korisnikov mjesec rodenja je: " + mjesec);
                    break;
                case 5:
                    System.out.println("Korisnikova godina rodenja je: " + godina);
                    break;
            }
            odabir = sc.nextInt();
        }

    }
}
