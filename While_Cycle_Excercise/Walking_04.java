package While_Cycle_Excercise;

import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int stepsTargetPerDay = 10000;
        int totalSteps = 0;

        while (!input.equals("Going home")) {
            int stepsWalked = Integer.parseInt(input);

            totalSteps += stepsWalked;

            if (totalSteps >= stepsTargetPerDay) {
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!\n", totalSteps - stepsTargetPerDay);
                return;
            }

            input = scanner.nextLine();
        }

        int stepsToHome = Integer.parseInt(scanner.nextLine());

        int daySteps = totalSteps + stepsToHome;

        if (daySteps > stepsTargetPerDay) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!\n", daySteps - stepsTargetPerDay);
        } else {
            System.out.printf("%d more steps to reach goal.\n", Math.abs(stepsTargetPerDay - daySteps));
        }

    }
}
