package While_Cycle;

import java.util.Scanner;

public class MinNumber_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int minNumber = Integer.MAX_VALUE;

        while (!input.equals("Stop")) {
            int num = Integer.parseInt(input);

            minNumber = Math.min(minNumber, num);

            input = scanner.nextLine();
        }

        System.out.println(minNumber);

    }
}
