import mockito.com.BasicMathematics;
import mockito.com.Calculation;
import mockito.com.CalculatorManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculationTest {

    @Test
    public void testCalculation(){
        Calculation calculation = mock(Calculation.class);
        CalculatorManager calculatorManager = mock(CalculatorManager.class);


        when(calculation.complexCalculation(2,7)).thenReturn(11);

        Assertions.assertEquals(11, calculation.complexCalculation(2,7));
    }


    @Test
    public void testCalculatorManagerTest(){
        CalculatorManager calculatorManager = mock(CalculatorManager.class);

        when(calculatorManager.add(2, 7)).thenReturn(9);
        when(calculatorManager.multiply(2, 7)).thenReturn(14);
        when(calculatorManager.add(9, 14)).thenReturn(23);
        //Exception Handling
        when(calculatorManager.divide(anyInt(),0)).thenThrow(new ArithmeticException("Division by 0 not allowed"));

        Assertions.assertEquals(9, calculatorManager.add(2,7));
        Assertions.assertEquals(14, calculatorManager.multiply(2,7));
        Assertions.assertEquals(23, calculatorManager.add(9,14));
    }
}
