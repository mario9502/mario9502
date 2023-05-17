package While_Cycle_Excercise;

import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String bookOfAnnie = scanner.nextLine();

        String currentBook = scanner.nextLine();
        int booksCount = 0;

        while (!currentBook.equals("No More Books")) {
            if (currentBook.equals(bookOfAnnie)) {
                break;
            }
            booksCount++;
            currentBook = scanner.nextLine();

        }

        if (currentBook.equals(bookOfAnnie)) {
            System.out.printf("You checked %d books and found it.", booksCount);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.\n", booksCount);
        }
    }
}
