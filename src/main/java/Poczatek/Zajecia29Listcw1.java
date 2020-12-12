package Poczatek;

public class Zajecia29Listcw1 {

    public static void main(String[] args) {


        String tab[] = new String[3];
        tab[0] = "Kasia";
        tab[1] = "Janek";
        tab[2] = "Ola";

        for (int i = 0; i < tab.length; i++) {

            int ilosc_a = 0;
            for (int x = 0; x < tab[i].length(); x++) {
                System.out.print(tab[i].charAt(x));
                if (tab[i].charAt(x) == 'a') {
                    ilosc_a++;
                }
            }
            System.out.print(" Ilosc a w slowie: " + tab[i] + " " + "to:" + ilosc_a);
            System.out.print("\n");

        }
    }
}