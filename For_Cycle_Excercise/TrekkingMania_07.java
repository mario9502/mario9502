package For_Cycle_Excercise;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        int totalPeople = 0;

        double g1 = 0.00;
        double g2 = 0.00;
        double g3 = 0.00;
        double g4 = 0.00;
        double g5 = 0.00;

        for (int i = 0; i < groups; i++) {
            int peoples = Integer.parseInt(scanner.nextLine());
            totalPeople += peoples;

            if (peoples <= 5) {
                g1 += peoples;
            } else if (peoples <= 12) {
                g2 += peoples;
            } else if (peoples <= 25) {
                g3 += peoples;
            } else if (peoples <= 40) {
                g4 += peoples;
            } else {
                g5 += peoples;
            }

        }

        System.out.printf("%.02f%%\n", g1 / totalPeople * 100);
        System.out.printf("%.02f%%\n", g2 / totalPeople * 100);
        System.out.printf("%.02f%%\n", g3 / totalPeople * 100);
        System.out.printf("%.02f%%\n", g4 / totalPeople * 100);
        System.out.printf("%.02f%%\n", g5 / totalPeople * 100);
    }
}
