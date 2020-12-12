package Poczatek;

import java.util.Scanner;

public class Cwiczonko19pazdznr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int max = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int min = scanner.nextInt();

        if (max < min) {
            int temp = max;
            max=min;
            min=temp;

        }

        for (int i = max; i >= min; i--) {
            System.out.println(i);
        }
    }
}