package Po_Slojni_Proverki_Excercise;

import java.util.Locale;
import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Бюджет на групата – цяло число в интервала [1…8000]
        //Сезон – текст : "Spring", "Summer", "Autumn", "Winter"
        //Брой рибари – цяло число в интервала [4…18

        //"Yes! You have {останалите пари} leva left."
        //"Not enough money! You need {сумата, която не достига} leva."

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (season) {
            case "Spring":
                price = 3000;
                break;
            case "Summer":
            case "Autumn":
                price = 4200;
                break;
            case "Winter":
                price = 2600;
                break;
        }

        if (fishermen <= 6) {
            price = price - (price * 0.10);

        } else  if (fishermen <= 11) {
            price = price - (price * 0.15);
        } else {
            price = price - (price * 0.25);
        }

        if (fishermen % 2 == 0 && !season.equals("Autumn")) {
            price = price - (price * 0.05);
        }

        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", budget - price);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", price - budget);

        }
    }
}
