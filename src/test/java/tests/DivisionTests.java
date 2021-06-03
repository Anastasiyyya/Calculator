package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionTests extends BaseTest implements IDataProvider, IUserInput {

    @Test(description = "Division of two numbers", priority = 2)
    public void divisionTest() {
        Assert.assertEquals(calculator.division(firstNumber, secondNumber),firstNumber / secondNumber);
    }

    @Test(description = "Division of two numbers using dataProvider", dataProvider = "Some numbers",
            dataProviderClass = IDataProvider.class, priority = 1)
    public void divisionOfNumbersUsingDataProviderTest(double x, double y) {
        Assert.assertEquals(calculator.division(x, y),x / y);
    }
}
