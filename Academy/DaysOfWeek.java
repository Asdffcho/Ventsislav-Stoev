import javax.swing.*;
import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {

        int dayNumber;

        String daySuffix = null;
        String daysOfWeek = null;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter digit number between 1 and 7: ");
        dayNumber = scanner.nextInt();


        switch (dayNumber) {
            case 1:
                daySuffix = "-st";
                daysOfWeek = "Monday";
                break;
            case 2:
                daySuffix = "-nd";
                daysOfWeek = "Tuesday";
                break;
            case 3:
                daySuffix = "-rd";
                daysOfWeek = "Wednesday";
                break;
            case 4:
                daySuffix = "-th";
                daysOfWeek = "Thursday";
                break;
            case 5:
                daySuffix = "-th";
                daysOfWeek = "Friday";
                break;
            case 6:
                daySuffix = "-th";
                daysOfWeek = "Saturday";
                break;
            case 7:
                daySuffix = "-th";
                daysOfWeek = "Sunday";
                break;
            default:
                System.out.println("This is not a valid day of week: ");

        }
        if (dayNumber > 0 && dayNumber < 8)
        System.out.format("The %d-%s day of the week is %s" , dayNumber , daySuffix ,daysOfWeek );
    }

}
