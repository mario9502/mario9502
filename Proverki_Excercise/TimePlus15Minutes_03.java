package Proverki_Excercise;

import java.util.Scanner;

public class TimePlus15Minutes_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = minutes + 15 + (hours * 60);

        hours = totalMinutes / 60;
        minutes = totalMinutes % 60;

        if (hours > 23) {
            hours = 0;
        }
        if (minutes < 10) {
            System.out.printf("%d:0%d", hours, minutes);
        } else {
            System.out.printf("%d:%d", hours, minutes);
        }
    }
}
