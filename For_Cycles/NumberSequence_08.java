package For_Cycles;

import java.util.Scanner;

public class NumberSequence_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if (currentNum > maxNumber) {
                maxNumber = currentNum;
            }

            if (currentNum < minNumber) {
                minNumber = currentNum;
            }

            
        }

        System.out.printf("Max number: %d\n", maxNumber);
        System.out.printf("Min number: %d\n", minNumber);

    }
}
