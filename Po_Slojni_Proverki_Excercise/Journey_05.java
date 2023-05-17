package Po_Slojni_Proverki_Excercise;

import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Първи ред – Бюджет, реално число в интервала [10.00...5000.00].
        //Втори ред – Един от двата възможни сезона: "summer" или "winter".

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String place = "";
        String type = "";
        double price = 0;

        if (budget <= 100) {
            place = "Bulgaria";
            switch (season) {
                case "summer":
                    price = budget * 0.30;
                    type = "Camp";
                    break;
                case "winter":
                    price = budget * 0.70;
                    type = "Hotel";
                    break;
            }

        } else if (budget <= 1000) {
            place = "Balkans";
            switch (season) {
                case "summer":
                    price = budget * 0.40;
                    type = "Camp";
                    break;
                case "winter":
                    price = budget * 0.80;
                    type = "Hotel";
                    break;
            }

        } else {
            place = "Europe";
            type = "Hotel";
            price = budget * 0.90;

        }

        System.out.printf("Somewhere in %s%n", place);
        System.out.printf("%s - %.2f", type, price);


    }
}
