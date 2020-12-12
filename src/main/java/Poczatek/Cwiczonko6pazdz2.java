package Poczatek;

import java.util.Random;
import java.util.Scanner;

public class Cwiczonko6pazdz2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int a = r.nextInt(101);
        System.out.println("Podaj liczbę: ");
        int b = scanner.nextInt();

        while (a != b) {

            if (b > a) {
                System.out.println("Za duzo");
            }
            if (b < a) {
                System.out.println("Za malo");

            }
            b = scanner.nextInt();

        }
            System.out.println("Gratulacje");

        }
    }