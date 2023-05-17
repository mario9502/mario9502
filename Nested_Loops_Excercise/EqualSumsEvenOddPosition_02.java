package Nested_Loops_Excercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());


        for (int currentNumber = number1; currentNumber <= number2 ; currentNumber++) {

            int evenDigitSum = 0;
            int oddDigitSum = 0;

            String textNumber = String.valueOf(currentNumber);

            for (int currentDigit = 0; currentDigit < textNumber.length() ; currentDigit++) {

                int digit = Integer.parseInt(textNumber.charAt(currentDigit)+ "");

                if (currentDigit % 2 == 0) {
                    evenDigitSum += digit;
                } else {
                    oddDigitSum += digit;
                }

            }

            if (evenDigitSum == oddDigitSum) {
                System.out.print(currentNumber + " ");

            }
        }
    }
}
