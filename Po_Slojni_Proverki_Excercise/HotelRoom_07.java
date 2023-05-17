package Po_Slojni_Proverki_Excercise;

import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int period = Integer.parseInt(scanner.nextLine());

        double studio = 0;
        double apart = 0;

        switch (month) {
            case "May":
            case "October":
                studio = 50.00;
                apart = 65.00;
                if (period > 7 && period <= 14) {
                    studio = studio - (studio * 0.05);
                } else if (period > 14) {
                    studio = studio - (studio * 0.30);
                }

                break;
            case "June":
            case "September":
                studio = 75.20;
                apart = 68.70;
                if (period > 14) {
                    studio = studio - (studio * 0.20);
                }

                break;
            case "July":
            case "August":
                studio = 76.00;
                apart = 77.00;

                break;

        }

        if (period > 14) {
            apart = apart - (apart * 0.10);
        }



        System.out.printf("Apartment: %.2f lv.%n", apart * period);
        System.out.printf("Studio: %.2f lv.", studio * period);
    }
}
