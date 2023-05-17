package Nested_Loops_Excercise;

import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int primeNumSum = 0;
        int nonPrimeNumSum = 0;



        while (!input.equals("stop")) {

            int currentNum = Integer.parseInt(input);

            if (currentNum < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }

            boolean isNotPrime = false;

            for (int i = 2; i < currentNum; i++) {
                if (currentNum % i == 0) {
                    isNotPrime = true;
                    break;
                }
            }

            if (isNotPrime) {
                nonPrimeNumSum += currentNum;

            } else {
                primeNumSum += currentNum;

            }

            input = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d\n", primeNumSum);
        System.out.printf("Sum of all non prime numbers is: %d\n", nonPrimeNumSum);

    }
}
