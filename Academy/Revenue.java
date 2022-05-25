import java.util.Scanner;

public class Revenue {
  public static void main(String[] args) {

    int price;
    int quantity;
    int discount;
    int revenue = 0;


    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter unit price: ");
    price = scanner.nextInt();

    System.out.println("Enter quantity: ");
    quantity = scanner.nextInt();

    if ((quantity <= 100) && (quantity <= 120)) {
      discount = (revenue * 15) / 100;
      if (quantity >= 120) {
        discount = (revenue * 20) / 100;
        if (quantity < 100) {
          discount = 0;
        }

      }

      System.out.println("The revenue from sale: ");
    }
  }
}

