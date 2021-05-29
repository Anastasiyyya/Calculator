package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplicationTests extends BaseTest implements IDataProvider, IUserInput{

    @Test(description = "Multiplication of two numbers using dataProvider", dataProvider = "Some numbers",
            dataProviderClass = IDataProvider.class, priority = 1)
    public void multiplicationOfNumbersUsingDataProviderTest(double x, double y) {
        Assert.assertEquals(calculator.multiplication(x, y),x * y);
    }

    @Test(description = "Multiplication of two numbers", priority = 2)
    public void multiplicationTest() {
        Assert.assertEquals(calculator.multiplication(firstNumber, secondNumber),firstNumber * secondNumber);
    }
}
