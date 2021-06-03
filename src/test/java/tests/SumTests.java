package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumTests extends BaseTest implements IDataProvider, IUserInput{

    @Test(description = "Sum of two numbers using dataProvider", dataProvider = "Some numbers",
            dataProviderClass = IDataProvider.class, priority = 1)
    public void sumOfNumbersUsingDataProviderTest(double x, double y) {
        Assert.assertEquals(calculator.sum(x, y),x + y);
    }

    @Test(description = "Sum of two numbers", priority = 2)
    public void subtractionTest() {
        Assert.assertEquals(calculator.sum(firstNumber, secondNumber),firstNumber + secondNumber);
    }
}
