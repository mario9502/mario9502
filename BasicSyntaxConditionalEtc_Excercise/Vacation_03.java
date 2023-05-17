package BasicSyntaxConditionalEtc_Excercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int persons = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double pricePerPerson = 0.00;
        double totalPrice = persons * pricePerPerson;

        switch (typeOfGroup) {
            case "Students":

                switch (dayOfWeek) {
                    case "Friday":
                        pricePerPerson = 8.45;

                        break;
                    case "Saturday":
                        pricePerPerson = 9.80;

                        break;
                    case "Sunday":
                        pricePerPerson = 10.46;

                        break;
                }

                break;

            case "Business":

                switch (dayOfWeek) {
                    case "Friday":
                        pricePerPerson = 10.90;

                        break;
                    case "Saturday":
                        pricePerPerson = 15.60;

                        break;
                    case "Sunday":
                        pricePerPerson = 16;

                        break;
                }

                break;

            case "Regular":

                switch (dayOfWeek) {
                    case "Friday":
                        pricePerPerson = 15;

                        break;
                    case "Saturday":
                        pricePerPerson = 20;

                        break;
                    case "Sunday":
                        pricePerPerson = 22.50;

                        break;
                }

                break;
        }


            if (persons >= 30 && typeOfGroup.equals("Students")) {
                totalPrice = totalPrice - (totalPrice * 0.15);

            } else if (persons >= 100 && typeOfGroup.equals("Business")) {
                persons -= 10;

            } else if (persons >= 10 && persons <= 20 && typeOfGroup.equals("Regular")) {
                totalPrice = totalPrice - (totalPrice * 0.05);
            }

        System.out.printf("Total price: %.2f\n", totalPrice);
    }
}