package Nested_Loops_Excercise;

import java.util.Scanner;

public class NumberPyramid_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int currentNum = 1;

        boolean flag = false;

        for (int rows = 0; rows <= n; rows++) {
            for (int columns = 0; columns < rows; columns++) {
                if (currentNum > n) {
                    flag = true;
                    break;
                }

                System.out.print(currentNum + " ");
                currentNum++;

            }

            if (flag) {
                break;

            }

            System.out.println();
        }
    }
}
