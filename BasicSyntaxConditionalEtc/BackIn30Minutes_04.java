package BasicSyntaxConditionalEtc;

import java.util.Scanner;

public class BackIn30Minutes_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int minsSum = (hours * 60) + minutes + 30;

        int finalHour = minsSum / 60;
        int finalMins = minsSum % 60;

        if (finalHour > 23) {
            finalHour = 0;
        }

        System.out.printf("%d:%02d\n",finalHour, finalMins);
    }
}
