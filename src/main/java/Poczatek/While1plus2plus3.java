package Poczatek;

import java.util.Scanner;

public class While1plus2plus3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz pierwszą liczbę: ");
        int a = scanner.nextInt();
        System.out.println("Wpisz drugą liczbę (większą od pierwszej): ");
        int b = scanner.nextInt();
        int suma = 0;

        while (a <= b) {
            suma = suma + a;
            a++;
        }
        System.out.println(suma);

        suma = 0;
        do {
            suma = suma + a;
            a++;
        }
        while (a <= b);
        System.out.println(suma);
    }
}

