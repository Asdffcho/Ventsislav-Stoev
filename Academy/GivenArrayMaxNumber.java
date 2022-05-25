public class GivenArrayMaxNumber {
    public static void main(String[] args) {

        int[] arr ={3,5,11,29};

        int maxNumber = arr[0];

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > maxNumber)
            {
              maxNumber = arr[i];
            }
        }
        System.out.println("The maximum number is: " + maxNumber);
        }

    }

