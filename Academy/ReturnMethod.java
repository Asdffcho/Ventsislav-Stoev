import java.util.Scanner;

public class ReturnMethod {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(isEven(num));

    }
    public static boolean isEven(int num) {
        boolean isEvenNumber = false;

        if ((num % 2) == 0) {
            isEvenNumber = true;
        }
        return isEvenNumber;
    }
}






