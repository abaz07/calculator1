package abaz.calculator1.settings;

import org.springframework.stereotype.Service;

@Service
public class CalculatorSettingsImpl implements CalculatorSettings{
    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int division(int num1, int num2) {
        return num1 / num2;
    }

    @Override
    public int divide(int num1, int num2) {
        return num1 / num2;
    }
}

