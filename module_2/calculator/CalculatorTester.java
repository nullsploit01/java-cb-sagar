package module_2.calculator;

public class CalculatorTester {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        var additionResult = calculator.add(5, 3);
        System.out.println("Addition Result: " +  additionResult);

        var substractionResult = calculator.subtract(8, 3);
        System.out.println("Substraction Result: " +  substractionResult);

    }
}
