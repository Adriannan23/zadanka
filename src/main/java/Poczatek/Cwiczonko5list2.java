package Poczatek;

import java.util.Scanner;

public class Cwiczonko5list2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą dodatnią: ");
        int a = scanner.nextInt();

        for (int i = 0; i <= a; i++)
            if (i % 2 != 0) {
                System.out.println(i);
            }
    }
}
