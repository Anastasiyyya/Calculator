package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import pages.Calculator;

public class BaseTest implements IUserInput{

    Calculator calculator;

    @BeforeSuite
    public void printUserInput(){
        System.out.println("User input:" + firstNumber + ", " + secondNumber);
    }

    @BeforeClass
    public void initTest() {
        calculator = new Calculator();
        System.out.println("Test started");
    }

    @AfterClass(alwaysRun = true)
    public void endTest() {
        System.out.println("Test finished");
    }
}
