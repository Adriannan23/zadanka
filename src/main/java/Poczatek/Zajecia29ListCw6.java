package Poczatek;

import java.util.Scanner;

public class Zajecia29ListCw6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj slowo:");
        String slowo = scanner.nextLine();

        for (int i = slowo.length() - 1; i >= 0; i--) {
            System.out.println(slowo);}
    }}

