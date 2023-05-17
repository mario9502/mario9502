package BasicSyntaxConditionalEtc;

import java.util.Scanner;

public class MultiplicationTable20_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        int total = 0;

        if (secondNum > 10) {
            total = firstNum * secondNum;
            System.out.printf("%d X %d = %d\n", firstNum, secondNum, total);

        } else {

            for (int i = secondNum; i <= 10; i++) {
                total = firstNum * i;

                System.out.printf("%d X %d = %d\n", firstNum, i, total);

            }

        }
    }
}
