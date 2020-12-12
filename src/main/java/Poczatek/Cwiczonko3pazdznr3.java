package Poczatek;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Cwiczonko3pazdznr3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean twoCorrectNamesProvided = false;
        while (!twoCorrectNamesProvided) {
            String nameOne = scanner.nextLine();
            String nameTwo = scanner.nextLine();

            if(Character.isUpperCase(nameOne.charAt(0)) && Character.isUpperCase(nameTwo.charAt(0))) {
                twoCorrectNamesProvided = true;
                System.out.println("DZieki");
            } else  {
                System.out.println("Wpisz ponownie");
            }
        }

    }
}
