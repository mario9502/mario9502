package Nested_Loops_Excercise;

import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        double totalGrade = 0.00;
        int presentationCount = 0;

        while (!input.equals("Finish")) {

            presentationCount++;
            String currentPresentationName = input;
            double currentPresentationGrade = 0.00;

            for (int i = 0; i < n; i++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());

                totalGrade += currentGrade;
                currentPresentationGrade += currentGrade;
            }

            double presentationAvg = currentPresentationGrade / n;
            System.out.printf("%s - %.2f.\n", currentPresentationName, presentationAvg);

            input = scanner.nextLine();
        }

        double totalGradeAvg = totalGrade / (presentationCount * n);
        System.out.printf("Student's final assessment is %.2f.", totalGradeAvg);

    }
}
