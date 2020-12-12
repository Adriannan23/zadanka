package Poczatek;

import java.util.Scanner;

public class Cwiczenie5 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int wynik = 2;

        for (int i = 0; i<a ;i++) {
            wynik = wynik*2;

            System.out.println(wynik);

    }
}}