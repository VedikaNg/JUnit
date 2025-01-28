package mockito.com;

public class Calculation {
    CalculatorManager calculatorManager = new CalculatorManager();

    public int complexCalculation(int num1, int num2){
        int result = calculatorManager.add(calculatorManager.add(num1,num2),calculatorManager.multiply(num1,num2));
        result = calculatorManager.divide(result,num1);
        return result;
    }
}
