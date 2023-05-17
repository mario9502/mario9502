package Nested_Loops;

import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            double vacationPrice = Double.parseDouble(scanner.nextLine());
            double totalSavedMoney = 0;

            while (totalSavedMoney < vacationPrice) {
                double savedMoney = Double.parseDouble(scanner.nextLine());

                totalSavedMoney += savedMoney;

            }

            System.out.printf("Going to %s!\n", input);

            input = scanner.nextLine();
        }
    }
}
