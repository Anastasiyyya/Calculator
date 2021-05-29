package pages;

public class Calculator {

    public Calculator(){
    }
    public double sum(double x, double y) {
        System.out.println("The result of the sum operation: " + (x + y));
        return x + y;
    }

    public double subtraction(double x, double y) {
        System.out.println("The result of the sub operation: " + (x - y));
        return x - y;
    }

    public double multiplication(double x, double y) {
        System.out.println("The result of the multiplication operation: " + x * y);
        return x * y;
    }

    public double division(double x, double y) {
        if (y == 0) {
            System.out.println("Error! Division on 0!");
        } else {
            System.out.println("The result of the division operation: " + x / y);
        }
        return x / y;
    }
}
