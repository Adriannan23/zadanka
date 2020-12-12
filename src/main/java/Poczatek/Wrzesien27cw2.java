package Poczatek;

import java.util.Scanner;

public class Wrzesien27cw2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PODAJ LICZBE: ");
        int liczba = scanner.nextInt();

        if (liczba >= 0)
            System.out.println(liczba);

        else {
            System.out.println(liczba * -1);
        }

    }
}


