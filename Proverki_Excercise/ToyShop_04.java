package Proverki_Excercise;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double totalSum = (puzzles * 2.60) + (dolls * 3.0) + (bears * 4.10) + (minions * 8.20) + (trucks * 2.0);
        int toysPcs = puzzles + dolls + bears + minions + trucks;

        double discount = 0.0;

        if (toysPcs >= 50) {

            discount = totalSum * 0.25;

        }

        double afterDiscount = totalSum - discount;

        double rent = afterDiscount * 0.10;

        double earning = afterDiscount - rent;

        double yes = earning - tripPrice;

        double no = tripPrice - earning;

        if (earning >= tripPrice) {

            System.out.printf("Yes! %.2f lv left.", yes);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.",no);
        }



    }
}
