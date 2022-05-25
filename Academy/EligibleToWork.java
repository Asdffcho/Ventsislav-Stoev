import java.util.Scanner;

public class EligibleToWork {
    public static void main(String[] args) {


        int age;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if (age >= 16) {
            System.out.println("You are eligible to work:");
        } else {
            System.out.println("You are not eligible to work: ");
        }
        }
    }

