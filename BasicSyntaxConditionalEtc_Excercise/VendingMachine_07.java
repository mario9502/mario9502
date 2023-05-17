package BasicSyntaxConditionalEtc_Excercise;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String coinsInput = scanner.nextLine();

        double totalCoins = 0.00;

        while (!coinsInput.equals("Start")) {

            double coins = Double.parseDouble(coinsInput);

            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                totalCoins += coins;
            } else {
                System.out.printf("Cannot accept %.2f\n", coins);
            }

            coinsInput = scanner.nextLine();
        }

        double itemPrice = 0.00;
        double moneyLeft = totalCoins;
        boolean invalidProd = false;

        String productInput = scanner.nextLine();

        while (!productInput.equals("End")) {
            switch (productInput) {
                case "Nuts":
                    itemPrice = 2.0;

                    if (moneyLeft >= itemPrice) {
                    System.out.printf("Purchased %s\n", productInput);
                    moneyLeft -= itemPrice;
                    } else {
                    System.out.println("Sorry, not enough money");
                    }

                    break;
                case "Water":
                    itemPrice = 0.7;

                    if (moneyLeft >= itemPrice) {
                        System.out.printf("Purchased %s\n", productInput);
                        moneyLeft -= itemPrice;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }

                    break;
                case "Crisps":
                    itemPrice = 1.5;

                    if (moneyLeft >= itemPrice) {
                        System.out.printf("Purchased %s\n", productInput);
                        moneyLeft -= itemPrice;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }

                    break;
                case "Soda":
                    itemPrice = 0.8;

                    if (moneyLeft >= itemPrice) {
                        System.out.printf("Purchased %s\n", productInput);
                        moneyLeft -= itemPrice;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }

                    break;
                case "Coke":
                    itemPrice = 1.0;

                    if (moneyLeft >= itemPrice) {
                        System.out.printf("Purchased %s\n", productInput);
                        moneyLeft -= itemPrice;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }

                    break;
                default:

                    System.out.println("Invalid product");
                    break;
//                    invalidProd = true;
//                    break;

            }

//            if (invalidProd) {
//                System.out.println("Invalid product");
//                break;
//            } else if (moneyLeft >= itemPrice) {
//                System.out.printf("Purchased %s\n", productInput);
//                moneyLeft -= itemPrice;
//            } else {
//                System.out.println("Sorry, not enough money");
//            }

            productInput = scanner.nextLine();
        }

        System.out.printf("Change: %.2f\n", moneyLeft);

    }
}
