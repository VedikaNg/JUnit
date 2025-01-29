import mockito.com.BasicMathematics;
import mockito.com.Calculation;
import mockito.com.CalculatorManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class BasicMathematicsTest {

    @Test
    public void testBasicMathematics(){
        BasicMathematics basicMathematics = mock(BasicMathematics.class);

//        when(basicMathematics.mathematicsProblem()).thenReturn(11);

        doReturn(11).when(basicMathematics).mathematicsProblem();

        Assertions.assertEquals(11, basicMathematics.mathematicsProblem());
    }




}
