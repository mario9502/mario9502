package Proverki;

import java.util.Scanner;

public class AreaOfFigures_07 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        String figureType = scanner.nextLine();
        double area = 0.0;

        if (figureType.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            area = side * side;

        } else if (figureType.equals("rectangle")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            area = sideA * sideB;

        } else if (figureType.equals("triangle")) {
            double lengthA = Double.parseDouble(scanner.nextLine());
            double lengthH = Double.parseDouble(scanner.nextLine());
            area = (lengthA * lengthH) / 2;

        } else if (figureType.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            area = Math.PI * radius * radius;

        }

        System.out.printf("%.3f", area);

        }
    }

