package PurviStypki_Excercise;

import java.util.Scanner;

public class Repainting_06 {

    public static void main(String[] args) {
        // Четене
        //1.	Необходимо количество найлон (в кв.м.) - цяло число в интервала [1... 100]
        //2.	Необходимо количество боя (в литри) - цяло число в интервала [1…100]
        //3.	Количество разредител (в литри) - цяло число в интервала [1…30]
        //4.	Часовете, за които майсторите ще свършат работата - цяло число в интервала [1…9]


        // Условие
        //• Предпазен найлон - 1.50 лв. за кв. метър
        //•	Боя - 14.50 лв. за литър
        //•	Разредител за боя - 5.00 лв. за литър
        // За всеки случай, към необходимите материали, Румен иска да добави още 10% от количеството боя и 2 кв.м.
        // найлон, разбира се и 0.40 лв. за торбички. Сумата, която се заплаща на майсторите за 1 час работа,
        // е равна на 30% от сбора на всички разходи за материали.

        // Принтване
        // сумата на всички разходи

        Scanner scanner = new Scanner(System.in);

        int metersPlastic = Integer.parseInt(scanner.nextLine());
        int litersPaint = Integer.parseInt(scanner.nextLine());
        int litersRazreditel = Integer.parseInt(scanner.nextLine());
        int workingHours = Integer.parseInt(scanner.nextLine());

        double bags = 0.40;

        double materialPrice = ((metersPlastic + 2) * 1.50) + (((litersPaint * 0.10) + litersPaint) * 14.50) + (litersRazreditel * 5.0) + 0.40;
        double workersPrice = (materialPrice * 0.30) * workingHours;
        double totalPrice = materialPrice + workersPrice;

        System.out.println(totalPrice);

        }
    }

