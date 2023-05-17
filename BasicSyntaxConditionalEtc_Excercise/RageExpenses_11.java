package BasicSyntaxConditionalEtc_Excercise;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetTrashed = lostGamesCount / 2;
        int mouseTrashed = lostGamesCount / 3;
        int keyboardTrashed = 0;
        int displayTrashed = 0;


        for (int i = 1; i <= lostGamesCount; i++) {
            if (i % 6 == 0) {
                keyboardTrashed++;
            }

            if (i % 12 == 0) {
                displayTrashed++;
            }
        }

        double totalCosts = (headsetTrashed * headsetPrice) + (mouseTrashed * mousePrice) +
                (keyboardTrashed * keyboardPrice) + (displayTrashed * displayPrice);


        System.out.printf("Rage expenses: %.2f lv.\n", totalCosts);
    }
}
