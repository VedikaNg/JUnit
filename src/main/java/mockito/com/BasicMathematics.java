package mockito.com;

public class BasicMathematics {

    private final Calculation calculation;
    private final CalculatorManager calculatorManager;

    public BasicMathematics(Calculation calculation, CalculatorManager calculatorManager) {
        this.calculation = calculation;
        this.calculatorManager = calculatorManager;
    }

    public int mathematicsProblem(){
        return calculation.complexCalculation(2,7);
    }

}
