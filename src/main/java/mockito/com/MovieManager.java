package mockito.com;

import java.util.List;

public class MovieManager {
    private MovieService movieService;

    public MovieManager(MovieService movieService){
        this.movieService = movieService;
    }

    public List<String> findComedyMovies(){
        return movieService.getMoviesByGenre("Comedy");

    }

    public List<String> findEmotionaldMovies(){
        return movieService.getMoviesByGenre("Emotional");
    }


}
