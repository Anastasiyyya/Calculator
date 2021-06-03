package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubtractionTests extends BaseTest implements IDataProvider, IUserInput{

    @Test(description = "Subtraction of two numbers using dataProvider", dataProvider = "Some numbers",
            dataProviderClass = IDataProvider.class, priority = 1)
    public void subtractionOfNumbersUsingDataProviderTest(double x, double y) {
        Assert.assertEquals(calculator.subtraction(x, y),x - y);
    }

    @Test(description = "Subtraction of two numbers", priority = 2)
    public void subtractionTest() {
        Assert.assertEquals(calculator.subtraction(firstNumber, secondNumber),firstNumber - secondNumber);
    }
}
