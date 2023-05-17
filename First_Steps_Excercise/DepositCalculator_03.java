package PurviStypki_Excercise;

import java.util.Scanner;

public class DepositCalculator_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());

        int period = Integer.parseInt(scanner.nextLine());

        double interest = Double.parseDouble(scanner.nextLine()) / 100;

        double sum = deposit + period * ((deposit * interest) / 12);

        System.out.println(sum);



    }
}
