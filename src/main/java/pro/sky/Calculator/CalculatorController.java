package pro.sky.Calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {

        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String calculator() {
        return calculatorService.calculator();
    }

    @GetMapping(path = "/calculator/plus")
    public String sumCalculator(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.sumCalculator(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String minusCalculator(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.minusCalculator(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiplyCalculator(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.multiplyCalculator(num1, num2);
    }
    @GetMapping(path = "/calculator/divide")
    public String divideCalculator(@RequestParam double num1, @RequestParam double num2) {
        return calculatorService.divideCalculator(num1, num2);
    }
}

