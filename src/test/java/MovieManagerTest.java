import mockito.com.MovieManager;
import mockito.com.MovieService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

public class MovieManagerTest {

    @Test
    public void testFindComedyMovies(){
        MovieService movieServiceMock = Mockito.mock(MovieService.class);

        when(movieServiceMock.getMoviesByGenre("Comedy")).thenReturn(Arrays.asList("Hera Pheri","3 Idiots","Golmaal","Housefull"));

        MovieManager movieManager = new MovieManager(movieServiceMock);
        List<String> comedyMovies = movieManager.findComedyMovies();

        Assertions.assertNotNull(comedyMovies);
        Assertions.assertEquals(4, comedyMovies.size());
        Assertions.assertTrue(comedyMovies.contains("Housefull"));
    }

}
