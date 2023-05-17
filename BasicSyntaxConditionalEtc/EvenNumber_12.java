package BasicSyntaxConditionalEtc;

import java.util.Scanner;

public class EvenNumber_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

//        boolean isEven = true;
//
//        if (num % 2 == 1) {
//            isEven = false;
//        }

        while (num % 2 != 0) {
            System.out.println("Please write an even number.");

            num = Integer.parseInt(scanner.nextLine());
        }

        System.out.printf("The number is: %d\n", Math.abs(num));

    }
}
