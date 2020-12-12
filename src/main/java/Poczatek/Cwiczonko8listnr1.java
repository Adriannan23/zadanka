package Poczatek;

import java.util.Scanner;

public class Cwiczonko8listnr1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        int liczba1 = scanner.nextInt();

        System.out.println("Podaj drugą liczbę: ");
        int liczba2 = scanner.nextInt();

        System.out.println("Podaj trzecią liczbę: ");
        int liczba3 = scanner.nextInt();

        System.out.println("Podaj czwartą liczbę: ");
        int liczba4 = scanner.nextInt();

        if (liczba1 > liczba2 && liczba1 > liczba3 && liczba1 > liczba4) {
            System.out.println(liczba1);
        } else {
            if (liczba2 > liczba3 && liczba2 > liczba4) {
                System.out.println(liczba2);
            }
            if (liczba3 > liczba4) {
                System.out.println(liczba3);
            } else System.out.println(liczba4);
        }
    }
}



