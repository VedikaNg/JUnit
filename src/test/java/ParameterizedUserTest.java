import org.example.UserDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParameterizedUserTest{
    @ParameterizedTest
    @CsvSource({
          "Vedika, 21, true",
          "Gunishtha , 20, true",
          "Aarti, 17, false"
    })
    public void UserDetails(String name, int age, boolean result){
        UserDTO user = new UserDTO(name, age);
        Assertions.assertEquals(result, user.isAdult());
    }

}