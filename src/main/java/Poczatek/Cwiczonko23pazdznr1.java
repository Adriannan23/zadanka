package Poczatek;

import java.util.Scanner;

public class Cwiczonko23pazdznr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int a = scanner.nextInt();
        while (a != 5) {
            System.out.println("Podaj liczbe");
            a = scanner.nextInt();}

            if (a == 5) {
                System.out.println("koniec");
            }
        }
    }

