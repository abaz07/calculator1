package abaz.calculator1.controller;

import abaz.calculator1.settings.CalculatorSettings;
import abaz.calculator1.settings.CalculatorSettingsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator1")
public class CalculatorController {
    private final CalculatorSettings calculatorSettings;

    public CalculatorController(CalculatorSettings calculatorSettings) {
        this.calculatorSettings = calculatorSettings;
    }

    @GetMapping("/info")
    public String ShowAnimation(){
        test();
        return "Добро пожаловать в калькулятор";
    }
    void test(){
        int sum = calculatorSettings.sum(2, 4);
        System.out.println(sum);
    }
    @GetMapping("/plus")
    public String sumNumbers(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2){
        if(num1 == null || num2 == null){
            return "Неверные данные";
        }
        int result = calculatorSettings.sum(num1, num2);
        return generateMessage(num1, num2, '+' , result);
    }
    private String generateMessage(int num1, int num2, char action, int result){
        return String.format("%d %c %d = %d", num1, '+' , num2, result);
    }

    @GetMapping("/subtraction")
    public String subtractionNumbers(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2){
        if(num1 == null || num2 == null){
            return "Неверные данные";
        }
        int result = calculatorSettings.subtraction(num1, num2);
        return generateMessage(num1, num2, '-', result);
    }
    private String generateMessage1(int num1, int num2, char action, int result){
        return String.format("%d %c %d = %d", num1,'-' , num2, result);
    }

    @GetMapping("/multiplication")
    public String multiplicationNumbers(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2){
        if(num1 == null || num2 == null){
            return "Неверные данные";
        }
        int result = calculatorSettings.multiplication(num1, num2);
        return generateMessage(num1, num2, '*' , result);
    }
    private String generateMessage2(int num1, int num2, char action, int result){
        return String.format("%d %c %d = %d", num1, '*' , num2, result);
    }

    @GetMapping("/division")
    public String divisionNumbers(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2){
        if(num1 == null || num2 == null){
            return "Неверные данные";
        }
        int result = calculatorSettings.division(num1, num2);
        return generateMessage(num1, num2, '/' , result);
    }
    private String generateMessage3(int num1, int num2, char action, int result){
        return String.format("%d %c %d = %d", num1, '/' , num2, result);
    }

    @GetMapping("/divide")
    public String divideNumbers(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2){
        if(num1 == null || num2 == null){
            return "Неверные данные";
        } else if(num2 == 0){
            return "Делить на 0 нельзя";
        }
        int result = calculatorSettings.divide(num1, num2);
        return generateMessage(num1, num2, '/' , result);
    }
    private String generateMessage4(int num1, int num2, char action, int result){
        return String.format("%d %c %d = %d", num1, '/' , num2, result);
    }
}
