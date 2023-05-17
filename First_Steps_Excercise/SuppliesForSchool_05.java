package PurviStypki_Excercise;

import java.util.Scanner;

public class SuppliesForSchool_05 {

    public static void main(String [] args) {

        Scanner scanner = new Scanner (System.in);


            //•	Брой пакети химикали - цяло число в интервала [0...100]
            //•	Брой пакети маркери - цяло число в интервала [0...100]
            //•	Литри препарат за почистване на дъска - цяло число в интервала [0…50]
            //•	Процент намаление - цяло число в интервала [0...100]

        int packsOfPens = Integer.parseInt(scanner.nextLine());
        int packsOfMarkers = Integer.parseInt(scanner.nextLine());
        int packsOfCleaning = Integer.parseInt(scanner.nextLine());
        int discountPercents = Integer.parseInt(scanner.nextLine());

        double priceOfMaterials = (packsOfPens * 5.80) + (packsOfMarkers * 7.20) + (packsOfCleaning * 1.20);
        double discount = priceOfMaterials * (discountPercents / 100.0);

        System.out.println(priceOfMaterials - discount);

        }


    }
