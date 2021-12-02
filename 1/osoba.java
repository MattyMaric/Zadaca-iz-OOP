import java.util.*;

//Napisat kod s koji sadrzi varijable ime, prezime, i datum rodenja(Mora biti phranjeno u 3 varijable)
//Korisiniku treba omoguciti pozivanje informacije koju on zeli, te tu informaciju ispisati na ekranu.

public class osoba {


    static public void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String ime = "Mateo";
        String prezime = "Maric";
        int dan = 17;
        int mjesec = 07;
        int godina = 2001;

        System.out.println("Upisite broj podatka koje zelite prikazati na ekranu:");
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
                    System.out.println("Korisnikov dan rodenja je: " + dan);
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
