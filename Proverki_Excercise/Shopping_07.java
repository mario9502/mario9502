package Proverki_Excercise;

import java.util.Scanner;

public class Shopping_07 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int video = Integer.parseInt(scanner.nextLine());
        int processor = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double videoPrice = video * 250;
        double processorPrice = processor * (videoPrice * 0.35);
        double ramPrice = ram * (videoPrice * 0.10);

        double totalPrice = videoPrice + processorPrice + ramPrice;

        if (video > processor) {
            totalPrice = totalPrice - (totalPrice * 0.15);
        }

        if (budget >= totalPrice) {

            System.out.printf("You have %.2f leva left!", budget - totalPrice);
        } else {

            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(totalPrice - budget));
        }

    }
}
