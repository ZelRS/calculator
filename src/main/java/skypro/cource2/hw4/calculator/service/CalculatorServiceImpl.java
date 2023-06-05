package skypro.cource2.hw4.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

//    private int num1;
//    private int num2;

    @Override
    public String getGreetings() {
        return "Добро пожаловать в калькулятор!";
    }

    @Override
    public int getSum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int getSubtraction(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int getMultiplication(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int getDivision(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Нельзя делить на ноль!");
        }
        return num1 / num2;
    }
}
