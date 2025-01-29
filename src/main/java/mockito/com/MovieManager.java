package mockito.com;

import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.List;

public class MovieManager {
    private MovieService movieService;

    public MovieManager(MovieService movieService){
        this.movieService = movieService;
    }

    public List<String> findComedyMovies() throws SQLException {
        return movieService.getMoviesByGenre("Comedy");

    }


    public List<String> findEmotionaldMovies() throws SQLException {
        return movieService.getMoviesByGenre("Emotional");
    }

    public List<String> saveToDB(MovieService movieService)throws SQLException {
        List<String> comedyMovies;
        try{
            comedyMovies = movieService.getMoviesByGenre("Comedy");
        } catch (SQLException e) {
            throw new DBReadException("Unable to access the Database "+e.getMessage());
        }
        return comedyMovies;
    }


    public void writeToDB(MovieService movieService) throws SQLException {
        try {
            movieService.save("Ajab Prem Ki Gazab Kahani");
        } catch (SQLException e) {
            throw new DBWriteException("Unable to write in the DB"+ e.getMessage());
        }
    }
}
