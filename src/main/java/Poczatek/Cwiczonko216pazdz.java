package Poczatek;

import java.util.Scanner;

public class Cwiczonko216pazdz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int liczba = scanner.nextInt();
        if(liczba % 2 == 0) {
            System.out.println(Math.abs(liczba));
        } else {
            System.out.println(liczba * -1);

            
        }
        }
    }

