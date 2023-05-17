package While_Cycle_Excercise;

import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int freeSpaceWidth = Integer.parseInt(scanner.nextLine());
        int freeSpaceLength = Integer.parseInt(scanner.nextLine());
        int freeSpaceHeight = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int roomSpace = freeSpaceWidth * freeSpaceHeight * freeSpaceLength;
        int totalBoxes = 0;

        while (!input.equals("Done")) {
            int boxCount = Integer.parseInt(input);

            totalBoxes += boxCount;
            roomSpace -= boxCount;

            if (roomSpace <= 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.\n", totalBoxes - (freeSpaceWidth * freeSpaceHeight * freeSpaceLength));
                return;
            }

            input = scanner.nextLine();
        }

        System.out.printf("%d Cubic meters left.\n", (freeSpaceWidth * freeSpaceHeight * freeSpaceLength) - totalBoxes);
    }
}
