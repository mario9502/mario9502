package For_Cycles;

import java.util.Scanner;

public class OddEvenSum_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int currentPosition = 0;
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            currentPosition++;

            if (currentPosition % 2 == 0) {
                oddSum += currentNum;
            } else {
                evenSum += currentNum;
            }


        }

        if (oddSum == evenSum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d\n", oddSum);

        } else {
            System.out.println("No");
            System.out.printf("Diff = %d\n", Math.abs(evenSum - oddSum));
        }
    }
}
