package Po_Slojni_Proverki;

import java.util.Scanner;

public class NumberInRange_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        boolean isValid = num >= -100 && num <= 100 && num != 0;

        if (isValid) {

            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
