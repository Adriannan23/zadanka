package Poczatek;

import java.util.Scanner;

public class PotegiLiczby2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int n = scanner.nextInt();

        int aktualnyWynik = 1;
        while (aktualnyWynik <= n) {
            aktualnyWynik = aktualnyWynik * 2;
            System.out.println(aktualnyWynik);
        }
    }
}

