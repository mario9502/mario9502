package BasicSyntaxConditionalEtc;

import java.util.Scanner;

public class ForeignLanguages_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String countryName = scanner.nextLine();

        String spokenLanguage = "";

        switch (countryName) {
            case "England":
            case "USA":
                spokenLanguage = "English";
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                spokenLanguage = "Spanish";
                break;
            default: spokenLanguage = "unknown";
        }

        System.out.println(spokenLanguage);
    }
}
