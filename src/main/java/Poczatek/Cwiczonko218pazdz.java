package Poczatek;

import java.util.Scanner;

public class Cwiczonko218pazdz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj do ilu mam wypisac liczby:");
        int b = scanner.nextInt();

        for (int i = 1; i <= b; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " Jestem podzielna przez 3 i 5 ");
            }
            if (i % 2 == 0) {
                System.out.println(i + " Jestem parzysta");
            } else {
                System.out.println(i + " Nie jestem parzysta");

            }
        }
    }
}