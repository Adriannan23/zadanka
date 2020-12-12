package Poczatek;

public class MetodaDodawanie {
    private static MetodaDodawanie ourInstance = new MetodaDodawanie();

    public static MetodaDodawanie getInstance() {
        return ourInstance;
    }

    private MetodaDodawanie() {
    }
}
