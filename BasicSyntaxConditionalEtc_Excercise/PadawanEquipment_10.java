package BasicSyntaxConditionalEtc_Excercise;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double georgeLucasMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double lightSabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        int freeBelts = countOfStudents / 6;

        lightSabersPrice = lightSabersPrice * Math.ceil(countOfStudents + (countOfStudents * 0.10));
        robesPrice = robesPrice * countOfStudents;
        beltsPrice = beltsPrice * (countOfStudents - freeBelts);

        double allItemsPrice = lightSabersPrice + robesPrice + beltsPrice;

        if (georgeLucasMoney >= allItemsPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.\n", allItemsPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.\n", Math.abs(georgeLucasMoney - allItemsPrice));
        }
    }
}
