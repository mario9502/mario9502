package For_Cycles;

import java.util.Scanner;

public class LeftAndRightSum_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int right = 0;
        int left = 0;

        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            right += currentNum;
        }

        for (int j = 0; j < n; j++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            left += currentNum;

        }

        if (right == left) {
            System.out.printf("Yes, sum = %d\n", right);

        } else {
            System.out.printf("No, diff = %d\n", Math.abs(right - left));
        }
    }
}
