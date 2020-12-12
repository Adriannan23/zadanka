package Poczatek;

import java.util.Scanner;

public class Cwiczonko7pazdznr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz pierwszą liczbę: ");
        int a = scanner.nextInt();
        System.out.println("Wpisz drugą liczbę (większą od pierwszej): ");
        int b = scanner.nextInt();

        int iloczyn = 1;
        {
            for (int i = a; i <= b; i++) {
                iloczyn = iloczyn * i;
            }
            System.out.println(iloczyn);
        }
    }
}