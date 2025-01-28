import mockito.com.BasicMathematics;
import mockito.com.Calculation;
import mockito.com.CalculatorManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BasicMathematicsTest {

    @Test
    public void testBasicMathematics(){
        BasicMathematics basicMathematics = mock(BasicMathematics.class);
        Calculation calculation = mock(Calculation.class);
        CalculatorManager calculatorManager = mock(CalculatorManager.class);

//        when(calculatorManager.add(2,7)).thenReturn(9);
//        when(calculatorManager.multiply(2,7)).thenReturn(14);
//        when(calculatorManager.add(9,14)).thenReturn(23);
//        when(calculation.complexCalculation(2,7)).thenReturn(11);
        when(basicMathematics.mathematicsProblem()).thenReturn(11);

        Assertions.assertEquals(11, basicMathematics.mathematicsProblem());
    }




}
