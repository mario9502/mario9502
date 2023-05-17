package Proverki_Excercise;

import java.util.Scanner;

public class GodzillavsKong_05 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double clothPerPerson = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;


        if (people > 150) {

            clothPerPerson = clothPerPerson - (clothPerPerson * 0.10);
        }

        double totalClothPrice = clothPerPerson * people;

        double totalSpendings = decor + totalClothPrice;

        if (totalSpendings > budget) {
            double no = totalSpendings - budget;

            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", no);

        } else {
            double yes = budget - totalSpendings;

            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", yes);

        }

    }
}
