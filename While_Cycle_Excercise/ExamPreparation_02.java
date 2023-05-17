package While_Cycle_Excercise;

import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int poorGradesAllowed = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int taskCount = 0;
        int poorGradesCount = 0;
        int totalScore = 0;
        String lastProblem = "";

        while (!input.equals("Enough")) {
            lastProblem = input;

            int currentGrade = Integer.parseInt(scanner.nextLine());
            taskCount++;
            totalScore += currentGrade;

            if (currentGrade <= 4) {
                poorGradesCount++;
            }

            if (poorGradesCount == poorGradesAllowed) {
                System.out.printf("You need a break, %d poor grades.\n", poorGradesCount);
                return;
            }

            input = scanner.nextLine();
        }

        double avgScore = totalScore * 1.0 / taskCount;

        System.out.printf("Average score: %.2f\n", avgScore);
        System.out.printf("Number of problems: %d\n", taskCount);
        System.out.printf("Last problem: %s\n", lastProblem);

    }
}
