package While_Cycle_Excercise;

import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int cakeSize = width * length;
        int totalGuestPieces = 0;

        while (!input.equals("STOP")) {
            int guestPieces = Integer.parseInt(input);

            totalGuestPieces += guestPieces;
            cakeSize -= guestPieces;

            if (cakeSize <= 0) {
                System.out.printf("No more cake left! You need %d pieces more.\n", Math.abs(totalGuestPieces - (width * length)));
                break;

            }

            input = scanner.nextLine();

        }

        if (cakeSize > 0) {
            System.out.printf("%d pieces are left.\n", (width * length) - totalGuestPieces);

        }

    }
}
