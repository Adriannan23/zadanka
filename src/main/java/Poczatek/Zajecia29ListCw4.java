package Poczatek;

public class Zajecia29ListCw4 {
    public static int cyfra(int liczba, int b) {
        int licznik = 0;
        while (liczba > 0) {
            if (liczba % 10 == b) {
                licznik++;
            }
            liczba /= 10;
        }
        return (licznik);
    }
}