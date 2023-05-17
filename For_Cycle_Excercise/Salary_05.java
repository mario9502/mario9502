package For_Cycle_Excercise;

import java.util.Scanner;

public class Salary_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int browserTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < browserTabs; i++) {
            String website = scanner.nextLine();

            switch (website) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;

            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
            }

        }
        if (salary > 0) {
            System.out.println(salary);
        }
    }
}