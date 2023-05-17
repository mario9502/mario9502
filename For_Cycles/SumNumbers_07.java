package For_Cycles;

import java.util.Scanner;

public class SumNumbers_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numCount = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int n = 1; n <= numCount; n++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum = sum + number;
        }

        System.out.println(sum);
    }
}
