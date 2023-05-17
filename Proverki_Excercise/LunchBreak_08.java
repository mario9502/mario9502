package Proverki_Excercise;

import java.util.Scanner;

public class LunchBreak_08 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        String showName = (scanner.nextLine());
        int episodeTime = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakTime * 0.125;
        double restTime = breakTime * 0.25;
        double timeLeft = breakTime - lunchTime - restTime;

        if (timeLeft >= episodeTime) {

            double freeTime = Math.ceil(timeLeft - episodeTime);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",showName, freeTime);

        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", showName, Math.abs(Math.ceil(episodeTime - timeLeft)));

        }

    }
}
