import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {


        int Budget;

        int NumBeachMin = 0;
        int numMountainMin;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your budget for Beach: ");
        Budget = scanner.nextInt();

        if (NumBeachMin <= 50) {
                System.out.println("Take vacation in Bulgaria: ");
            } else if (NumBeachMin>=50) {
            System.out.println("Take vacation Outside Bulgaria: ");
        }


        }
    }


