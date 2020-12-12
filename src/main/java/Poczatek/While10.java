package Poczatek;

import java.util.Scanner;

public class While10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę: ");
        int licznik = 0;

        while (licznik<10) {
            licznik++;
            System.out.println(licznik);
        }
}}
