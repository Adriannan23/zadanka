package Poczatek;

import java.util.Arrays;
import java.util.Random;

public class Zajecia29Listcw2 {
    public static void main(String[] args) {
        Random random = new Random();
        int tab[][] = new int[2][3];
        int licznik = 0;
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {
                tab[i][j] = random.nextInt(100) + 1;
                if (tab[i][j] % 2 == 0) {
                    licznik++;
                }
                System.out.println(tab[i][j]);
            }

        }
        System.out.println(licznik);
        System.out.println("WYGLADA TO TAK: "+Arrays.deepToString(tab));
    }
}

