package BasicSyntaxConditionalEtc_Excercise;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            char currentSymbol = username.charAt(i);
            password += currentSymbol;
        }

        boolean flag = false;

        for (int j = 1; j <= 4; j++) {
            String passwordInput = scanner.nextLine();

            if (password.equals(passwordInput)) {
                System.out.printf("User %s logged in.\n", username);
                flag = true;
                break;
            } else if (j <= 3) {
                System.out.printf("Incorrect password. Try again.\n");
            }

        }

        if (!flag) {
            System.out.printf("User %s blocked!\n", username);
        }
    }
}
