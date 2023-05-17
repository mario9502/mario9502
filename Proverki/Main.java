package Proverki;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = 8;

        if (a < 4) {
            System.out.println("less than 4");
        } else if (a == 4) {
            System.out.println("Equal to 4");
        } else if (a > 4) {
            System.out.println("bigger than 4");
        }

    }
}
