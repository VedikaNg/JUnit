import mockito.com.StaticMethod;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StaticMethodTest {

    @Test
    public void testSquare(){

        try(MockedStatic<StaticMethod> mockStaticMethod = Mockito.mockStatic(StaticMethod.class)){
            mockStaticMethod.when(()->StaticMethod.square(5)).thenReturn(25);
            assertEquals(StaticMethod.square(5),25);
//            assertThrows(ArithmeticException.class, ()->StaticMethod.square(6));
        }
    }
}
