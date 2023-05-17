package For_Cycles;

import java.util.Scanner;

public class EvenPowersOf2_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int powers = 0; powers <= n; powers+=2) {
            System.out.printf("%.0f%n", Math.pow(2, powers));

        }
    }
}
