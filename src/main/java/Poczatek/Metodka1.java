package Poczatek;

public class Metodka1 {
    public static void main(String[] args) {
//
//        int wynik1 = podniesDoTrzeciej(2);
//        int wynik2 = podniesDoTrzeciej(3);
//        System.out.println(wynik1 + wynik2);
//
//        double wynik3=pierwiatekZLiczby(6);
    }

    static void drukujTekst(String tekst) {
        System.out.println(tekst);
    }

    static void wypiszSumeRozniceIloczyn(int liczba1, int liczba2) {
        System.out.println(liczba1 + liczba2);
        System.out.println(liczba1 - liczba2);
        System.out.println(liczba1 * liczba2);
    }

    static double podniesDoDrugiej(double liczba) {
        double aktualnyWynik = liczba;
        for (int i = 0; i < 1; i++) {
            aktualnyWynik = aktualnyWynik * liczba;
        }
        return aktualnyWynik;
    }

    static double pierwiatekZLiczby(double liczba) {
        return Math.sqrt(liczba);
    }

    static boolean jestProstokatny(double liczba1, double liczba2, double liczba3) {
        if (podniesDoDrugiej(liczba1) + podniesDoDrugiej(liczba2) == podniesDoDrugiej(liczba3)) {
            return true;
        }
        return false;
    }
}
