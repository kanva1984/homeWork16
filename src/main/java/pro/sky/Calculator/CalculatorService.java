package pro.sky.Calculator;


public interface CalculatorService {
    String calculator();

    String sumCalculator(int num1, int num2);

    String minusCalculator(int num1, int num2);

    String multiplyCalculator(int num1, int num2);

    String divideCalculator(double num1, double num2);
}
