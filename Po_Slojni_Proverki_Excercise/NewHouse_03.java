package Po_Slojni_Proverki_Excercise;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Вид цветя - текст с възможности - "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
        //Брой цветя - цяло число в интервала [10…1000]
        //Бюджет - цяло число в интервала [50…2500]

        //Ако бюджета им е достатъчен - "Hey, you have a great garden with {броя цвета} {вид цветя} and {останалата сума} leva left."
        //Ако бюджета им е НЕ достатъчен - "Not enough money, you need {нужната сума} leva more."

        String flowers = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (flowers) {
            case "Roses":
                price = count * 5.00;
                if (count > 80) {
                    price = price - (price * 0.10);
                }
                break;
            case "Dahlias":
                price = count * 3.80;
                if (count > 90) {
                    price = price - (price * 0.15);
                }
                break;
            case "Tulips":
                price = count * 2.80;
                if (count > 80) {
                    price = price - (price * 0.15);
                }
                break;
            case "Narcissus":
                price = count * 3.00;
                if (count < 120) {
                    price = price + (price * 0.15);
                }
                break;
            case "Gladiolus":
                price = count * 2.50;
                if (count < 80) {
                    price = price + (price * 0.20);
                }
                break;

        }

        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %s %s and %.2f leva left.", count, flowers, budget - price);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }

    }
}
