package Poczatek;

import java.util.Scanner;

public class ProgramUruchomieniowy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PODAJ LICZBE: ");

        int liczba = scanner.nextInt();
        if (Zajecia29ListCw5.cyfra(liczba)) {
            System.out.println("Liczba jest podzielna przez 5 i 3");
        } else System.out.println("Liczba nie jest podzelna przez 3 i 5");


//        System.out.println("PODAJ Cyfrę: ");
//        int cyfra = scanner.nextInt();
//        System.out.println(Poczatek.Zajecia29ListCw4.cyfra(liczba,cyfra));
    }
}

