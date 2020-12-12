package Zadania_z_kursu;

public class Miedzy50a100PodzielnePrzez7For {

    public static void main(String[] args) {

        for (int i = 50; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println("Ta liczby pomiedzy 50 a 100 jest podzielne przez 7: " +i);
            }
        }
    }
}
