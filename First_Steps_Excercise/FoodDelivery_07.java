package PurviStypki_Excercise;

import java.util.Scanner;

public class FoodDelivery_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Условие
        //-Пилешко меню –  10.35 лв.
        //-Меню с риба – 12.40 лв.
        //-Вегетарианско меню  – 8.15 лв.
        //Напишете програма, която изчислява колко ще струва на група хора да си поръчат храна за вкъщи.
        //Групата ще си поръча и десерт, чиято цена е равна на 20% от общата сметка (без доставката).
        //Цената на доставка е 2.50 лв и се начислява най-накрая.

        // Четене
        //• Брой пилешки менюта – цяло число в интервала [0 … 99]
        //•	Брой менюта с риба – цяло число в интервала [0 … 99]
        //•	Брой вегетариански менюта – цяло число в интервала [0 … 99]

        // Отпечатваме
        // цена на поръчката

        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int vegieMenus = Integer.parseInt(scanner.nextLine());

        double saltMenus = (chickenMenus * 10.35) + (fishMenus * 12.40) + (vegieMenus * 8.15);
        double desertPrice = saltMenus * 0.20;

        double totalPrice = saltMenus + desertPrice + 2.50;

        System.out.println(totalPrice);

        }


    }
