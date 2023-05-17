package BasicSyntaxConditionalEtc;

import java.util.Scanner;

public class TheatrePromotion_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String typeDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int ticketPrice = 0;
        boolean flag = false;

        switch (typeDay) {
            case "Weekday":
                if (age >= 0 && age <= 18) {
                    ticketPrice = 12;
                } else if (age >= 19 && age <= 64) {
                    ticketPrice = 18;
                } else if (age >= 65 && age <= 122) {
                    ticketPrice = 12;
                } else {
                    flag = true;
                }
                break;
            case "Weekend":
                if (age >= 0 && age <= 18) {
                    ticketPrice = 15;
                } else if (age >= 19 && age <= 64) {
                    ticketPrice = 20;
                } else if (age >= 65 && age <= 122) {
                    ticketPrice = 15;
                } else {
                    flag = true;
                }
                break;
            case "Holiday":
                if (age >= 0 && age <= 18) {
                    ticketPrice = 5;
                } else if (age >= 19 && age <= 64) {
                    ticketPrice = 12;
                } else if (age >= 65 && age <= 122) {
                    ticketPrice = 10;
                } else {
                    flag = true;
                }
                break;
        }

        if (!flag) {
            System.out.printf("%d$\n", ticketPrice);
        } else {
            System.out.println("Error!");
        }
    }
}
