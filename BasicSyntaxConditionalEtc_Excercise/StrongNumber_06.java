package BasicSyntaxConditionalEtc_Excercise;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int factNum = num;

        int factSum = 0;

        while (num > 0) {
            int lastDigit = num % 10;

            int currentFactSum = 1;

            for (int i = 1; i <= lastDigit; i++) {
                currentFactSum = currentFactSum * i;
            }

            factSum += currentFactSum;

            num = num / 10;
        }

        if (factSum == factNum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
