package Nested_Loops_Excercise;

import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int totalTickets = 0;
        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;

        while (!input.equals("Finish")) {

            int freeSeats = Integer.parseInt(scanner.nextLine());

            int remainingFreeSeats = freeSeats;

            String movieName = input;
            String ticketType = scanner.nextLine();

            int ticketsPerMovie = 0;

            while (!ticketType.equals("End")) {

                remainingFreeSeats--;
                totalTickets++;
                ticketsPerMovie++;

                switch (ticketType) {
                    case "student":
                        studentTickets++;
                        break;
                    case "standard":
                        standardTickets++;
                        break;
                    case "kid":
                        kidTickets++;
                        break;

                }

                if (remainingFreeSeats <= 0){
                    break;
                }

                ticketType = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.\n", movieName, ((ticketsPerMovie * 1.0) * 100) / freeSeats);


            input = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d\n", totalTickets);
        System.out.printf("%.2f%% student tickets.\n", ((studentTickets * 1.0) * 100) / totalTickets);
        System.out.printf("%.2f%% standard tickets.\n", ((standardTickets * 1.0) * 100) / totalTickets);
        System.out.printf("%.2f%% kids tickets.\n", ((kidTickets * 1.0) * 100) / totalTickets);

    }
}
