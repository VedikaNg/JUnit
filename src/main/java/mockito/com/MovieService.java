package mockito.com;

import java.sql.SQLException;
import java.util.List;

public interface MovieService {
    List<String> getMoviesByGenre(String genre) throws SQLException;

    public void save(String s) throws SQLException;


}