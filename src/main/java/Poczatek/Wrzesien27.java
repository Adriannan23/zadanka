package Poczatek;

import java.util.Scanner;

public class Wrzesien27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PODAJ ROK: ");

        int rok = scanner.nextInt();
        if (rok % 4 == 0 && rok % 100 != 0 || rok % 400 == 0) {
            System.out.println("ROK PRZESTEPNY");
        } else {
            System.out.println("ROK NIE JEST PRZESTEPNY");
        }


    }
}