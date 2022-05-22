import java.util.Scanner;

public class TriangleByGivenSides {
    public static void main(String[] args) {

            double sideA;
            double height;

            Scanner scanner = new Scanner(System.in);
            System.out.println("sideA: ");
            sideA = scanner.nextDouble();

            System.out.println("height: ");
            height = scanner.nextDouble();

            System.out.println("Triangle surface is: " + (sideA*height/2) );

    }
}
