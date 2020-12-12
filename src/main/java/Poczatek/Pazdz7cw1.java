package Poczatek;

import java.util.Scanner;

public class Pazdz7cw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int numer =  scanner.nextInt();
        switch (numer){
            case 1:
                System.out.println("jeden");
                break;
            case 2:
                System.out.println("dwa");
                break;
            case 3:
                System.out.println("trzy");
                break;
            default:
                System.out.println("podana liczba musi zawierac sie w przedziale od jeden do trzy");
        }
    }
}
