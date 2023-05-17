package Proverki;

import java.util.Scanner;

public class GreaterNumber_02 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        String color = scanner.nextLine();

        if (color.equals("red")) {

            System.out.println("Tomato");
        } else {

            System.out.println("Not Tomato");
        }
        System.out.println("bye");
    }
}
