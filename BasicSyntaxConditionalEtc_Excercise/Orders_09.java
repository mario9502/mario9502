package BasicSyntaxConditionalEtc_Excercise;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0.00;

        for (int i = 1; i <= n; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double coffeePrice = ((days * capsulesCount) * pricePerCapsule);
            totalPrice += coffeePrice;
            System.out.printf("The price for the coffee is: $%.2f\n", coffeePrice);

        }

        System.out.printf("Total: $%.2f\n", totalPrice);
    }
}
