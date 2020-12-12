package Poczatek;

import java.util.Scanner;

public class zajecia28list {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj slowo:");
        String slowo = scanner.nextLine();

        char literka=scanner.next().charAt(0);
        int ile=0;

        for (int i=0; i<slowo.length(); i++){
           if (slowo.charAt(i) == literka)
               ile++;
            }
        }
    }
