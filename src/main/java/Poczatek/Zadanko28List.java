package Poczatek;

import java.util.Random;

public class Zadanko28List {
    public static void main(String[] args) {

        int tab[] = new int[100];
        Random r = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = r.nextInt(20);
        }
        int wynik = 0;
        for (int i = 0; i < tab.length; i++) {
//            wynik = wynik + tab[i];
            System.out.println(tab[i]);
        }
//        System.out.println(wynik);
        int min = tab[0];
        int max = tab[0];

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        System.out.println("Max " + max);
        System.out.println("Min " + min);
    }
}
