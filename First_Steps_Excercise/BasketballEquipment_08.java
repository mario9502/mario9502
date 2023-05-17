package PurviStypki_Excercise;

import java.util.Scanner;

public class BasketballEquipment_08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Условие
        //•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        // Четене
        //•	Годишната такса за тренировки по баскетбол – цяло число в интервала [0… 9999]

        // Отпечатване
        // колко ще са разходите на Джеси, ако започне да спортува баскетбол

        int annualPrice = Integer.parseInt(scanner.nextLine());

        double shoes = annualPrice - (annualPrice * 0.40);
        double kit = shoes - (shoes * 0.20);
        double ball = kit * 0.25;
        double accesories = ball * 0.20;

        System.out.println(annualPrice + (shoes + kit + ball + accesories));

    }
}
