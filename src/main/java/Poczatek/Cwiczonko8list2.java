package Poczatek;

import java.util.Scanner;

public class Cwiczonko8list2 {
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

        int m = liczba1;
        if (m > liczba2) m = liczba2;
        if (liczba3 > m) m = liczba3;
        if (liczba4 > m) m = liczba4;
        System.out.println(m);
    }
}
