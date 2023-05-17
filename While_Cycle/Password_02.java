package While_Cycle;

import java.util.Scanner;

public class Password_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String pass = scanner.nextLine();

        while (true) {
            String correctPass = scanner.nextLine();

            if (correctPass.equals(pass)) {
                break;
            } else {
                System.out.println("Wrong Pass!");
            }
            continue;

        }

        System.out.printf("Welcome %s!", name);

    }
}
