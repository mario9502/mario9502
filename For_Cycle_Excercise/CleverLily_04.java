package For_Cycle_Excercise;

import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double laundryPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int birthdayMoney = 10;
        int lilyToys = 0;
        int lilyMoney = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 1) {
                lilyToys++;

            } else {
                lilyMoney += birthdayMoney;
                birthdayMoney += 10;
                lilyMoney -= 1;
            }

        }

        lilyMoney += lilyToys * toyPrice;

        if (lilyMoney >= laundryPrice) {
            System.out.printf("Yes! %.2f", lilyMoney * 1.0 - laundryPrice);
        } else {
            System.out.printf("No! %.2f", Math.abs(laundryPrice - lilyMoney));

        }
    }
}
