package BasicSyntaxConditionalEtc_Excercise;

import java.util.Scanner;

public class PrintAndSum_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int sedondNum = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = firstNum; i <= sedondNum; i++) {
            sum += i;

            System.out.print(i + " ");
        }

        System.out.printf("\nSum: %d", sum);

    }
}