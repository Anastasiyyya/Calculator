package tests;

import org.testng.annotations.DataProvider;

public interface IDataProvider {

    @DataProvider(name = "Some numbers")
    static Object[][] inputForCalculator() {
        return new Object[][]{
                {100, -2},
                {50, 40},
        };
    }
}
