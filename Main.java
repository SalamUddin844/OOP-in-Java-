// Interface (Abstraction)
interface CalculatorInterface {
    double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b);
}

// Parent Class (Encapsulation + Implementation of Interface)
class Calculator implements CalculatorInterface {
    private double result;  // Encapsulation

    // Getter
    public double getResult() {
        return result;
    }

    // Setter
    public void setResult(double result) {
        this.result = result;
    }

    // Implementing interface methods (Abstraction)
    public double add(double a, double b) {
        result = a + b;
        return result;
    }

    public double subtract(double a, double b) {
        result = a - b;
        return result;
    }

    public double multiply(double a, double b) {
        result = a * b;
        return result;
    }

    public double divide(double a, double b) {
        if (b != 0) {
            result = a / b;
        } else {
            System.out.println("Cannot divide by zero");
            result = 0;
        }
        return result;
    }

    // Method Overloading (Polymorphism)
    public double add(double a, double b, double c) {
        result = a + b + c;
        return result;
    }
}

// Child Class (Inheritance + Method Overriding)
class AdvancedCalculator extends Calculator {
    // Overriding add() method (Polymorphism)
    @Override
    public double add(double a, double b) {
        System.out.println("Advanced Add Called");
        double result = super.add(a, b);  // Calling parent method
        return result;
    }

    // Extra method
    public double power(double base, double exponent) {
        double result = Math.pow(base, exponent);
        setResult(result);  // Using setter
        return result;
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        AdvancedCalculator calc = new AdvancedCalculator();

        System.out.println("Add: " + calc.add(5, 3));                    // Overridden method
        System.out.println("Add Overloaded: " + calc.add(1, 2, 3));      // Overloaded method
        System.out.println("Subtract: " + calc.subtract(10, 4));
        System.out.println("Multiply: " + calc.multiply(3, 3));
        System.out.println("Divide: " + calc.divide(10, 2));
        System.out.println("Power: " + calc.power(2, 3));                // Extra method

        System.out.println("Final Result: " + calc.getResult());         // Getter
    }
}
