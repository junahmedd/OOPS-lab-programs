// Interface for Addition
interface Addition {
    // Method to perform addition
    void addition(int a, int b);
}

// Interface for Subtraction
interface Subtraction {
    // Method to perform subtraction
    void subtract(int a, int b);
}

// Calculator class implementing both Addition and Subtraction interfaces
class Calculator implements Addition, Subtraction {
    // Implementation of addition method
    @Override
    public void addition(int a, int b) {
        System.out.println("Addition result: " + (a + b));
    }

    // Implementation of subtraction method
    @Override
    public void subtract(int a, int b) {
        System.out.println("Subtraction result: " + (a - b));
    }

    // Method for Multiplication
    public void multiply(int a, int b) {
        System.out.println("Multiplication result: " + (a * b));
    }

    // Method for Division
    public void divide(int a, int b) {
        if (b != 0) {
            System.out.println("Division result: " + ((double) a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}

// Main class to test the Calculator
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Perform addition
        calculator.addition(10, 5);

        // Perform subtraction
        calculator.subtract(10, 5);

        // Perform multiplication
        calculator.multiply(10, 5);

        // Perform division
        calculator.divide(10, 5);
    }
}
