public class ArraySum {
    public static void main(String[] args) {

        int[] givenArray = {5, 13, 25, 47};
        int sum = 0;

        for (int i : givenArray) {
            sum += i;
        }
        System.out.println(sum);
    }
}
