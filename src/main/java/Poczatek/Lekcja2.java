package Poczatek;

import java.util.Scanner;

public class Lekcja2 {
    public static void main(String[] args) {
        String name;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj swoje imie: ");
        name = userInput.next();

        if (name.equals("kaska")) {
            System.out.println("jestes debilem");

        } else if (name.equals("ada"))
            System.out.println("jestes super");

        else {
            System.out.println("jestes najlepszy");
        }
    }
}

