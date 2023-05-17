package PurviStypki;

import java.util.Scanner;

public class PetShop_08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        double dogsPrice = 2.50;
        double catsPrice = 4;

        double dogsNum = Double.parseDouble(scanner.nextLine());
        double catsNum = Double.parseDouble(scanner.nextLine());

        double dogsTotal = dogsPrice * dogsNum;
        double catsTotal = catsPrice * catsNum;

        System.out.println(dogsTotal + catsTotal);



    }
}
