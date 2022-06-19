public class ComputeOfThreeNumbers {
    public static void main(String[] args) {
        System.out.println(findAverageNumber(23, 55, 32));
        System.out.println(findAverageNumber(232, 345, 39));
    }

    public static double findAverageNumber(double x, double y, double z){
        return (x + y + z) / 3;
    }
}









