package Poczatek;

import java.util.Scanner;

public class IleMalychLiterWTekscie {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj tekst");
        String tekst = scanner.nextLine();
        System.out.println("podaj litere");
        char znak = scanner.next().charAt(0);
        int ile = 0;
        for (int i = 0; i < tekst.length(); i++)
            if (tekst.charAt(i) == znak)
                ile++;


        System.out.println("liter jest: " + ile);
    }
}
