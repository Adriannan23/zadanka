package Poczatek;

import java.util.Scanner;

public class C2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int liczba = scanner.nextInt();
        switch (liczba) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            System.out.println("dzien powszedni");
            break;
            case 6:
            case 7:
            System.out.println("weekend");
            default:
                System.out.println("taki dzien nie istnieje");
        }
    }
}
