import mockito.com.BookStore;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;

public class BookStoreTest {

    @Test
    public void testSetAuthorName(){
        BookStore book = mock(BookStore.class);

        doNothing().when(book).setAuthorName("Happy");

    }


}
