import mockito.com.DBWriteException;
import mockito.com.DBReadException;
import mockito.com.DBWriteException;
import mockito.com.MovieManager;
import mockito.com.MovieService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class MovieManagerTest {

//    @InjectMocks
//    private MovieService movieServiceMock;

    @Mock
    private MovieManager movieManager;

    @Test
    public void testFindComedyMovies() throws SQLException {
        MovieService movieServiceMock = mock(MovieService.class);

        when(movieServiceMock.getMoviesByGenre("Comedy")).thenReturn(Arrays.asList("Hera Pheri","3 Idiots","Golmaal","Housefull"));

        MovieManager movieManager = new MovieManager(movieServiceMock);
        List<String> comedyMovies = movieManager.findComedyMovies();

        Assertions.assertNotNull(comedyMovies);
        Assertions.assertEquals(4, comedyMovies.size());
        Assertions.assertTrue(comedyMovies.contains("Housefull"));
    }


    @Test
    public void testSaveToDB() throws SQLException {
        MovieService movieService = mock(MovieService.class);
        when(movieManager.saveToDB(movieService)).thenThrow(DBReadException.class);
        Assertions.assertThrows(DBReadException.class, () -> movieManager.saveToDB(movieService));

    }

    @Test
    public void testWriteToDB() throws SQLException {
        MovieService movieService = mock(MovieService.class);
        doThrow(DBWriteException.class).when(movieManager).writeToDB(movieService);
        Assertions.assertThrows(DBWriteException.class, () -> movieManager.writeToDB(movieService));

    }

}
