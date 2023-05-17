package Po_Slojni_Proverki_Excercise;

import java.util.Scanner;

public class OnTimeExam_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMin = Integer.parseInt(scanner.nextLine());

        int examTimeInMinutes = (examHour * 60) + examMin;
        int arrivalTimeInMinutes = (arrivalHour * 60) + arrivalMin;

        int diff = Math.abs(examTimeInMinutes - arrivalTimeInMinutes);

        if (examTimeInMinutes < arrivalTimeInMinutes) {
            System.out.println("Late");
            int hour = diff / 60;
            int min = diff % 60;
            if (diff < 60) {
                System.out.printf("%d minutes after the start", min);
            } else {
                System.out.printf("%d:%02d hours after the start", hour, min);
            }

        }

        if (examTimeInMinutes >= arrivalTimeInMinutes && diff <= 30) {
            if (examTimeInMinutes == arrivalTimeInMinutes) {
                System.out.println("On Time");
            } else {
                System.out.println("On Time");
                System.out.printf("%d minutes before the start", diff);
            }
        }

        if (examTimeInMinutes > arrivalTimeInMinutes && diff > 30) {
            System.out.println("Early");
            int hour = diff / 60;
            int min = diff % 60;
            if (diff < 60) {
                System.out.printf("%d minutes before the start", min);
            } else {
                System.out.printf("%d:%02d hours before the start", hour, min);
            }

        }
    }
}
