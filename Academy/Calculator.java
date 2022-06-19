package MentorMate;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Calculator {
    @DataProvider(name = "data-provider")
    public Object[][] dpMethod() {
        return new Object[][]{{77, 21}};
    }

    @Test(dataProvider = "data-provider", groups = "addition")
    public void myTest(int a, int b) {
        int addition = a + b;
        Assert.assertEquals(addition, a + b);
    }

    @Test(dataProvider = "data-provider", groups = "subtraction")
    public void subtraction(int a, int b) {
        int subtraction = a - b;
        Assert.assertEquals(subtraction, a - b);
    }

    @Test(dataProvider = "data-provider", groups = "multiplication")
    public void multiplication(int a, int b) {
        int multiplication = a * b;
        Assert.assertEquals(multiplication, a * b);
    }

    @Test(dataProvider = "data-provider", groups = "division")
    public void division(int a, int b) {
        int division = a / b;
        Assert.assertEquals(division, a / b);
    }

    @Test(dataProvider = "data-provider", groups = "modul")
    public void modul(int a, int b) {
        int modul = a % b;
        Assert.assertEquals(modul, a % b);
    }
}
