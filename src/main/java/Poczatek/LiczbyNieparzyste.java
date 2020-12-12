package Poczatek;

import java.util.Scanner;

public class LiczbyNieparzyste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();
        for (int i = -10; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(liczba);
            }
        }
    }
}