import java.util.*;

public class datum {

    static public void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String mjesecText = null;
        int[] DaniUMjesecima = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        System.out.print("Upisite dan: ");
        int dan = sc.nextInt();
        System.out.print("Upisite mjesec: ");
        int mjesec = sc.nextInt();
        System.out.print("Upisite godinu: ");
        int godina = sc.nextInt();

        switch (mjesec) {
            case 1:
                mjesecText = "Sijecanj";
                break;
            case 2:
                mjesecText = "Veljaca";
                break;
            case 3:
                mjesecText = "Ozujak";
                break;
            case 4:
                mjesecText = "Travanj";
                break;
            case 5:
                mjesecText = "Svibanj";
                break;
            case 6:
                mjesecText = "Lipanj";
                break;
            case 7:
                mjesecText = "Srpanj";
                break;
            case 8:
                mjesecText = "Kolovoz";
                break;
            case 9:
                mjesecText = "Rujan";
                break;
            case 10:
                mjesecText = "Listopad";
                break;
            case 11:
                mjesecText = "Studeni";
                break;
            case 12:
                mjesecText = "Prosinac";
                break;
        }

        if (dan > DaniUMjesecima[0] && mjesec == 1) {
            System.out.println("Sijecanj nema " + dan + " dana, nego " + DaniUMjesecima[0] + " dan");
        }
         else if (dan > DaniUMjesecima[1] && mjesec == 2) {
            System.out.println("Veljaca nema " + dan + " dana, nego " + DaniUMjesecima[1] + " dana");
        } 
        else if (dan > DaniUMjesecima[2] && mjesec == 3) {
            System.out.println("Ozujak nema " + dan + " dana, nego " + DaniUMjesecima[2] + " dan");
        }
         else if (dan > DaniUMjesecima[3] && mjesec == 4) {
            System.out.println("Travanj nema " + dan + " dana, nego " + DaniUMjesecima[3] + " dana");
        }
         else if (dan > DaniUMjesecima[4] && mjesec == 5) {
            System.out.println("Svibanj nema " + dan + " dana, nego " + DaniUMjesecima[4] + " dan");
        }
         else if (dan > DaniUMjesecima[5] && mjesec == 6) {
            System.out.println("Lipanj nema " + dan + " dana, nego " + DaniUMjesecima[5] + " dana");
        }
        else if (dan > DaniUMjesecima[6] && mjesec == 7) {
            System.out.println("Srpanj nema " + dan + " dana, nego " + DaniUMjesecima[6] + " dan");
        }
        else if (dan > DaniUMjesecima[7] && mjesec == 8) {
            System.out.println("Kolovoz nema " + dan + " dana, nego " + DaniUMjesecima[7] + " dan");
        }
         else if (dan > DaniUMjesecima[8] && mjesec == 9) {
            System.out.println("Rujan nema " + dan + " dana, nego " + DaniUMjesecima[8] + " dana");
        }
         else if (dan > DaniUMjesecima[9] && mjesec == 10) {
            System.out.println("Listopad nema " + dan + " dana, nego " + DaniUMjesecima[9] + " dan");
        }
         else if (dan > DaniUMjesecima[10] && mjesec == 11) {
            System.out.println("Studeni nema " + dan + " dana, nego " + DaniUMjesecima[10] + " dana");
        }
         else if (dan > DaniUMjesecima[11] && mjesec == 12) {
            System.out.println("Prosinac nema " + dan + " dana, nego " + DaniUMjesecima[11] + " dan");
        }else{
            System.out.println("Upisali ste datum: " + dan + "."  + mjesecText  + "." + godina + ".");
        }


        
    }
}
