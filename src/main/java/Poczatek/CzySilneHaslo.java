package Poczatek;

import java.util.Scanner;

public class CzySilneHaslo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj tekst");
        String tekst = scanner.nextLine();

        int mocnehaslo = 0;

        int ile_cyfr = 0;
        int ile_malych_liter = 0;
        int ile_ducych_liter = 0;

        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.charAt(i) >= 'a' && tekst.charAt(i) <= 'z') {
                ile_malych_liter++;
            }
            if (tekst.charAt(i) >= 'A' && tekst.charAt(i) <= 'Z') {
                ile_ducych_liter++;
            }
            if (tekst.charAt(i) >= 48 && tekst.charAt(i) <= 57) {
                ile_cyfr++;
            }
            if (ile_malych_liter > 0 && ile_ducych_liter > 0 && tekst.length() >= 7) {
                System.out.println("haslo jest silne");
            } else {
                System.out.println("haslo jest slabe");
            }
        }
    }
}
