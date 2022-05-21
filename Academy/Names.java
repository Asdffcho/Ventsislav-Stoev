package Academy;

import java.util.Scanner;

public class Names {


    public static class WholeName {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your fist name: ");
            String firstName = scanner.nextLine();

            //       scanner = new Scanner(System.in);
            System.out.println("Enter your middle name: ");
            String middleName = scanner.nextLine();

//        scanner = new Scanner(System.in);
            System.out.println("Enter your last name: ");
            String lastName = scanner.nextLine();

            System.out.println("My full name is: "+ firstName + " " + middleName + " " + lastName);

        }
    }
}
