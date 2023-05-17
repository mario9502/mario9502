package Po_Slojni_Proverki;

import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        boolean zeroTo500 = sales >= 0 && sales <=500;
        boolean fiveToThousand = sales > 500 && sales <= 1000;
        boolean thousandToTen = sales > 1000 && sales <= 10000;
        boolean moreThanTen = sales > 10000;

        double value = 0;

        boolean isValid = true;

        if (city.equals("Sofia")){
            if (zeroTo500) {
                value = sales * 0.05;

            } else if (fiveToThousand) {
                value = sales * 0.07;

            } else if (thousandToTen) {
                value = sales * 0.08;

            } else if (moreThanTen) {
                value = sales * 0.12;
            } else {
                isValid = false;
            }

        } else if (city.equals("Varna")) {
            if (zeroTo500) {
                value = sales * 0.045;

            } else if (fiveToThousand) {
                value = sales * 0.075;

            } else if (thousandToTen) {
                value = sales * 0.10;

            } else if (moreThanTen) {
                value = sales * 0.13;
            } else {
                isValid = false;
            }


        } else if (city.equals("Plovdiv")){
            if (zeroTo500) {
                value = sales * 0.055;

            } else if (fiveToThousand) {
                value = sales * 0.08;

            } else if (thousandToTen) {
                value = sales * 0.12;

            } else if (moreThanTen) {
                value = sales * 0.145;
            } else {
                isValid = false;
            }

        } else  {
            isValid = false;
        }

        if (isValid) {
            System.out.printf("%.2f", value);

        } else {
            System.out.println("error");

        }
    }
}
