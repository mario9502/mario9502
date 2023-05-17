package Po_Slojni_Proverki;

import java.util.Scanner;

public class FruitShop_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        boolean workingDays = dayOfWeek.equals("Monday")
                || dayOfWeek.equals("Tuesday")
                || dayOfWeek.equals("Wednesday")
                || dayOfWeek.equals("Thursday")
                || dayOfWeek.equals("Friday");

        boolean daysOff = dayOfWeek.equals("Saturday")
                || dayOfWeek.equals("Sunday");

        boolean isValid = true;

        double price = 0;


        if (workingDays) {
            if (fruit.equals("banana")) {
                price = 2.50;

            } else if (fruit.equals("apple")) {
                price = 1.20;

            } else if (fruit.equals("orange")) {
                price = 0.85;

            } else if (fruit.equals("grapefruit")) {
                price = 1.45;

            } else if (fruit.equals("kiwi")) {
                price = 2.70;

            } else if (fruit.equals("pineapple")) {
                price = 5.50;

            } else if (fruit.equals("grapes")) {
                price = 3.85;

            } else {
                isValid = false;
            }


        } else if (daysOff) {
            if (fruit.equals("banana")) {
                price = 2.70;

            } else if (fruit.equals("apple")) {
                price = 1.25;

            } else if (fruit.equals("orange")) {
                price = 0.90;

            } else if (fruit.equals("grapefruit")) {
                price = 1.60;

            } else if (fruit.equals("kiwi")) {
                price = 3.00;

            } else if (fruit.equals("pineapple")) {
                price = 5.60;

            } else if (fruit.equals("grapes")) {
                price = 4.20;

            } else {
                isValid = false;
            }

        } else {
            isValid = false;
        }

        if (isValid) {
            double total = quantity * price;
            System.out.printf("%.2f", total);

        } else {

            System.out.println("error");
        }

    }

}