package Academy;

import java.util.Scanner;

public class TrianglePerimeter {
    public static void main(String[] args) {

        double sideA;
        double sideB;
        double sideC;

        Scanner scanner = new Scanner(System.in);
        System.out.println("sideA: ");
        sideA = scanner.nextDouble();


        System.out.println("sideB: ");
        sideB = scanner.nextDouble();


        System.out.println("sideC: ");
        sideC = scanner.nextDouble();

        System.out.println("The perimeter of the triangle is: " + (sideA + sideB + sideC + "sm"));
    }
}
