package pro.sky.Calculator;

import org.springframework.stereotype.Service;

@Service
public  class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String calculator() {
        return "<b>Добро пожаловать в калькулятор\n</b>";
    }

    @Override
    public String sumCalculator(int num1, int num2) {
        return num1 + "+" + num2 + "=" + (num1 + num2);
    }
    @Override
    public String minusCalculator(int num1, int num2) {
        return num1 + "-" + num2 + "=" + (num1 - num2);
    }
    @Override
    public String multiplyCalculator(int num1, int num2) {
        return num1 + "*" + num2 + "=" + (num1 * num2);
    }
    @Override
    public String divideCalculator(double num1, double num2) {
        if (num2 == 0) {
            return "На 0 делить нельзя!";

        }else {
        return num1 + "/" + num2 + "=" + (num1 / num2);}
    }
}