package Nested_Loops;

import java.util.Scanner;

public class SumOfTwoNumbers_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int combinationNum = 0;

        boolean flag = false;

        for (int i = firstNum; i <= secondNum; i++) {
            for (int j = firstNum; j <= secondNum; j++) {
                combinationNum++;

                int sum = i + j;

                if (sum == magicNum) {
                    flag = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)\n", combinationNum, i, j, sum);
                }
            }

            if (flag) {
                break;
            }
        }

        if (!flag) {
        System.out.printf("%d combinations - neither equals %d", combinationNum, magicNum);
        }
    }
}
