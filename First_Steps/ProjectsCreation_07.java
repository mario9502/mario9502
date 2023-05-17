package PurviStypki;

import java.util.Scanner;

public class ProjectsCreation_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int projectNumbers = Integer.parseInt(scanner.nextLine());

        int timeNeeded = 3;

        int totalTime = projectNumbers * timeNeeded;

        //•	"The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} project/s."

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, totalTime, projectNumbers);
    }
}