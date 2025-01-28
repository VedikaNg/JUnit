import org.example.UserDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void testGetterAndSetter(){
        UserDTO u1 = new UserDTO("Vedika", 21);

        Assertions.assertEquals("Vedika",u1.getName());
        Assertions.assertEquals(21, u1.getAge());

    }


    @Test
    public void checkAdult(){
        UserDTO user = new UserDTO("Kanika",17);

        Assertions.assertFalse(user.isAdult());
        user.setAge(21);
        Assertions.assertTrue(user.isAdult());

    }
}
