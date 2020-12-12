package Poczatek;

import java.util.Random;

public class Zadanko28List2 {
    public static void main(String[] args) {

        int tab[] = new int[100];
        Random r = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = r.nextInt(20) + 1;
        }
        int temp;
        for (int j = 0; j < tab.length - 1; j++) {

            if (tab[j] > tab[j + 1]) {
                temp = tab[j + 1];
                tab[j + 1] = tab[1];
                tab[1] = temp;
            }
        }
    }
}
