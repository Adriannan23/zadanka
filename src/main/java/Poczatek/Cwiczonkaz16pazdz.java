package Poczatek;

import java.util.Scanner;

public class Cwiczonkaz16pazdz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        int liczba = scanner.nextInt();

        System.out.println("Podaj drugą liczbę: ");
        int liczba2 = scanner.nextInt();

        if (liczba > liczba2) {
            System.out.println(liczba * 2);
        } else {
            System.out.println(liczba2 * 2);
        }
    }
}

