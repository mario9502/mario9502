package For_Cycle_Excercise;

import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tourCount = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());

        int earnedPoints = 0;
        int totalPoints = 0;
        int wins = 0;

        for (int i = 0; i < tourCount; i++) {
            String stage = scanner.nextLine();


            switch (stage) {
                case "W":
                    earnedPoints += 2000;
                    wins++;
                    break;
                case "F":
                    earnedPoints += 1200;
                    break;
                case "SF":
                    earnedPoints += 720;
                    break;
            }

        }

        totalPoints = startPoints + earnedPoints;

        System.out.printf("Final points: %d\n", totalPoints);
        System.out.printf("Average points: %.0f\n", Math.floor((totalPoints * 1.0 - startPoints) / tourCount));
        System.out.printf("%.2f%%\n", wins * 1.0 / tourCount * 100 );

    }

}
