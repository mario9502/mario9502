package For_Cycles;

import java.util.Scanner;

public class Numbers1ToNWithStep3_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int num = 1; num <= n; num += 3) {

            System.out.println(num);
        }
    }

}
