package For_Cycles;

import java.util.Scanner;

public class NumbersN1_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = n; number >= 1; number-- ) {
            System.out.println(number);

        }
    }
}
