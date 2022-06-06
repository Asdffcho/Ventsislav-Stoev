public class SmallestNumber {


    public static void main(String[] args) {

        SmallestNumber smallestNumber = new SmallestNumber();
        smallestNumber.findSmallestNumber(11, 23, 44);
        smallestNumber.findSmallestNumber(56, 123, 56);
    }

    public void findSmallestNumber(int x, int y, int z) {
        if (x <= y && x <= z) {
            System.out.println("Smallest number is " + x);
        } else if (y <= x && y <= z) {
            System.out.println("Smallest number is " + y);
        } else {
            System.out.println("Smallest number is " + z);
        }
    }
}

