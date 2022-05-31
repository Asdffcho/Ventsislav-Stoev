public class BiggestElement {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 543, 1500, 987};
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i];

        }
        System.out.println("Largest number is: " + largest);
    }
}


