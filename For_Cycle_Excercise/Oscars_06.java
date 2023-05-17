package For_Cycle_Excercise;

import java.util.Scanner;
import java.util.spi.CalendarDataProvider;

public class Oscars_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int jury = Integer.parseInt(scanner.nextLine());

        double earnedPoints = 0;
        earnedPoints += academyPoints;

        for (int i = 1; i <= jury; i++) {
            String juryName = scanner.nextLine();
            double juryPoints = Double.parseDouble(scanner.nextLine());
            earnedPoints += (juryName.length() * juryPoints) / 2;

            if (earnedPoints > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, earnedPoints);
                return;
            }

        }

        if (earnedPoints < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, Math.abs(earnedPoints - 1250.5));
        }
    }
}
