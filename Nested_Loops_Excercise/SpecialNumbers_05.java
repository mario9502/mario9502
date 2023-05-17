package Nested_Loops_Excercise;

import java.util.Scanner;

public class SpecialNumbers_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        
        

        for (int currentNumber = 1111; currentNumber <= 9999; currentNumber++) {

            boolean isSpecial = true;
            String textNumber = String.valueOf(currentNumber);

            for (int currentDigit = 0; currentDigit < textNumber.length(); currentDigit++) {

                int digit = Integer.parseInt(textNumber.charAt(currentDigit) + "");

                if (digit == 0) {
                    isSpecial = false;
                    break;
                }

                if (n % digit != 0) {
                    isSpecial = false;
                    break;
                }
                
            }

            if (isSpecial) {
                System.out.print(currentNumber + " ");
            }
            
        }
    }
}
