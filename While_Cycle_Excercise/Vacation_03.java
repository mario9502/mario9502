package While_Cycle_Excercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        double jessieMoney = Double.parseDouble(scanner.nextLine());

        int spending = 0;
        int saving = 0;
        int daysPassed = 0;

        while (jessieMoney <= tripPrice) {
            daysPassed++;

            String spendOrSave = scanner.nextLine();
            double spendOrSaveSum = Double.parseDouble(scanner.nextLine());

            switch (spendOrSave) {
                case "spend":
                    spending++;
                    jessieMoney -= spendOrSaveSum;

                    if (jessieMoney < 0) {
                        jessieMoney = 0;
                    }

                    break;
                case "save":
                    saving++;
                    spending = 0;
                    jessieMoney += spendOrSaveSum;

                    break;
            }

            if (spending == 5) {
                System.out.println("You can't save the money.");
                System.out.printf("%d", daysPassed);
                break;

            }
            if (jessieMoney >= tripPrice) {
                System.out.printf("You saved the money for %d days.", daysPassed);
                break;
            }

        }
    }
}
