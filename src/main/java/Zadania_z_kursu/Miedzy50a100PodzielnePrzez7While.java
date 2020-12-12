package Zadania_z_kursu;

public class Miedzy50a100PodzielnePrzez7While {

    public static void main(String[] args) {

        int a = 50;
        while (a >= 50 && a <= 100) {
            a++;
            if (a%7==0){
                System.out.println(a);
            }
        }
    }
}

