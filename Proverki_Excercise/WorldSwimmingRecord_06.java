package Proverki_Excercise;

import java.util.Scanner;

public class WorldSwimmingRecord_06 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double metersPerSecs = Double.parseDouble(scanner.nextLine());

        double swimmingTimeInSec = distanceMeters * metersPerSecs;

        double delayedTime = Math.floor(distanceMeters / 15);
        swimmingTimeInSec = swimmingTimeInSec + (delayedTime * 12.5);

        if (swimmingTimeInSec < worldRecord) {

            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", swimmingTimeInSec);

        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", swimmingTimeInSec - worldRecord);
        }

    }
}
