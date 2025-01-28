import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CalculatorTest {

    Calculator cal = new Calculator();

    @Test
    @DisplayName("Assert Equal Value")
    public void assertEqualTest(){
        Assertions.assertEquals(4, cal.add(3,1));
//        Assertions.assertEquals(5, cal.add(3,1),()->"Both are not equal");
    }

    @Test
    @DisplayName("Division Function Check")
    public void divideCheck(){
        Assertions.assertEquals(5,cal.divide(10,2));
        Assertions.assertEquals(-1,cal.divide(1,0));
    }
}

