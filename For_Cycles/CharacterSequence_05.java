package For_Cycles;

import java.util.Scanner;

public class CharacterSequence_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        for (int n = name.length() - 1; n >= 0; n--) {
            System.out.println(name.charAt(n));

        }
    }
}
