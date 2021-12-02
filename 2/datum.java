import java.util.*;

public class datum {

    static public void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String mjesecText = null;

        System.out.print("Upisite dan: ");
        int dan = sc.nextInt();
        System.out.print("Upisite mjesec: ");
        int mjesec = sc.nextInt();
        System.out.print("Upisite godinu: ");
        int godina = sc.nextInt();
        sc.close();

        switch (mjesec) {
            case 1:
                mjesecText = "Sijecanj";
                if (dan > 31) {
                    System.out.println("Sijecanj nema " + dan + " dana, nego 31 dan");
                } else {
                    System.out.println("Upisali ste datum: " + dan + "." + mjesecText + "." + godina + ".");
                }
                break;
            case 2:
                mjesecText = "Veljaca";
                if (dan > 28) {
                    System.out.println("Veljaca nema " + dan + " dana, nego 28 dana");
                } else {
                    System.out.println("Upisali ste datum: " + dan + "." + mjesecText + "." + godina + ".");
                }
                break;
            case 3:
                mjesecText = "Ozujak";
                if (dan > 31) {
                    System.out.println("Ozujak nema " + dan + " dana, nego 31 dan");
                } else {
                    System.out.println("Upisali ste datum: " + dan + "." + mjesecText + "." + godina + ".");
                }
                break;
            case 4:
                mjesecText = "Travanj";
                if (dan > 30) {
                    System.out.println("Travanj nema " + dan + " dana, nego 30 dana");
                } else {
                    System.out.println("Upisali ste datum: " + dan + "." + mjesecText + "." + godina + ".");
                }
                break;
            case 5:
                mjesecText = "Svibanj";
                if (dan > 31) {
                    System.out.println("Svibanj nema " + dan + " dana, nego 31 dan");
                } else {
                    System.out.println("Upisali ste datum: " + dan + "." + mjesecText + "." + godina + ".");
                }
                break;
            case 6:
                mjesecText = "Lipanj";
                if (dan > 30) {
                    System.out.println("Lipanj nema " + dan + " dana, nego 30 dana");
                } else {
                    System.out.println("Upisali ste datum: " + dan + "." + mjesecText + "." + godina + ".");
                }
                break;
            case 7:
                mjesecText = "Srpanj";
                if (dan > 31) {
                    System.out.println("Srpanj nema " + dan + " dana, nego 31 dan");
                } else {
                    System.out.println("Upisali ste datum: " + dan + "." + mjesecText + "." + godina + ".");
                }
                break;
            case 8:
                mjesecText = "Kolovoz";
                if (dan > 31) {
                    System.out.println("Kolovoz nema " + dan + " dana, nego 31 dan");
                } else {
                    System.out.println("Upisali ste datum: " + dan + "." + mjesecText + "." + godina + ".");
                }
                break;
            case 9:
                mjesecText = "Rujan";
                if (dan > 30) {
                    System.out.println("Rujan nema " + dan + " dana, nego 30 dana");
                } else {
                    System.out.println("Upisali ste datum: " + dan + "." + mjesecText + "." + godina + ".");
                }
                break;
            case 10:
                mjesecText = "Listopad";
                if (dan > 31) {
                    System.out.println("Listopad nema " + dan + " dana, nego 31 dan");
                } else {
                    System.out.println("Upisali ste datum: " + dan + "." + mjesecText + "." + godina + ".");
                }
                break;
            case 11:
                mjesecText = "Studeni";
                if (dan > 30) {
                    System.out.println("Studeni nema " + dan + " dana, nego 30 dana");
                } else {
                    System.out.println("Upisali ste datum: " + dan + "." + mjesecText + "." + godina + ".");
                }
                break;
            case 12:
                mjesecText = "Prosinac";
                if (dan > 31) {
                    System.out.println("Prosinac nema " + dan + " dana, nego 31 dan");
                } else {
                    System.out.println("Upisali ste datum: " + dan + "." + mjesecText + "." + godina + ".");
                }
                break;
        }

    }
}
