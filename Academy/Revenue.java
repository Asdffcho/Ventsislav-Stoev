import java.util.Scanner;

public class Revenue {
  public static void main(String[] args) {

    int price = 0;
    float quantity = 0;
    float discount = 0;
    float revenue = 0f;


    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter unit price: ");
    price = scanner.nextInt();

    System.out.println("Enter quantity: ");
    quantity = scanner.nextInt();

    if ((quantity <= 120)) {
      revenue = price * quantity;
      discount = (revenue * 15) / 100; }
      if (quantity >= 120) {
        revenue = price * quantity;
        discount = (revenue * 20) / 100; }
        if (quantity <= 100) {
          discount = 0;
        }
    System.out.println("The revenue from sale: " + revenue);
    System.out.println("Discount: " + discount);
      }

    }


