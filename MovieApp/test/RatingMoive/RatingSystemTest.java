package RatingMoive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RatingSystemTest {
    @Test
    public void testThat_MovieCanBeAdded(){
        RatingMovie ratingMovie = new RatingMovie();
        String title = "Vincenzo";
        String producer = "leeJang-soo and Cho Soo-young";
        ratingMovie.addMovie(title,producer);
        assertEquals(1,ratingMovie.checkNumberOfMovieAvailable());


    }
    @Test
    public void testThat_MoreMoviesCanBeAdded(){
        RatingMovie ratingMovie = new RatingMovie();
        String title = "Vincenzo";
        String producer =  "leeJang-soo and Cho Soo-young";
        ratingMovie.addMovie(title,producer);
        String titleOne = "Koto Aye";
        String producerOne = "Femi Adebayo";
        ratingMovie.addMovie(titleOne,producerOne);
        assertEquals(2,ratingMovie.checkNumberOfMovieAvailable());

    }
    @Test
    public void testThat_OnlyOneMovieCanBeAddedOnce(){
        RatingMovie ratingMovie = new RatingMovie();
        String title = "Vincenzo";
        String producer =  "leeJang-soo and Cho Soo-young";
        ratingMovie.addMovie(title,producer);
        String titleOne = "Vincenzo";
        String producerOne ="leeJang-soo and Cho Soo-young";
        ratingMovie.addMovie(titleOne,producerOne);
        assertEquals(1,ratingMovie.checkNumberOfMovieAvailable());

    }
    @Test
    public void testFor_TheDateTheMovieWasUploaded(){
        RatingMovie ratingMovie = new RatingMovie();
        String title = "Vincenzo";
        String producer = "leeJang-soo and Cho Soo-young";
        ratingMovie.addMovie(title,producer);
        assertNotNull(ratingMovie.checkDate(title));

    }
    @Test
    public void testFor_RatingMovies(){
        RatingMovie ratingMovie = new RatingMovie();
        String title = "Vincenzo";
        String producer = "leeJang-soo and Cho Soo-young";
        ratingMovie.addMovie(title,producer);
        ratingMovie.rateMovie(title,4);
        assertEquals(4.0, ratingMovie.calculateAverageRating(title));


    }
    @Test
    public void testAverageRatingOfAMovie() {
        RatingMovie ratingMovie = new RatingMovie();
        String title = "Vincenzo";
        String producer = "leeJang-soo and Cho Soo-young";
        ratingMovie.addMovie(title,producer);
        ratingMovie.rateMovie("Vincenzo", 4);
        ratingMovie.rateMovie("Vincenzo", 5);
        ratingMovie.rateMovie("Vincenzo", 3);

        assertEquals(4.0, ratingMovie.calculateAverageRating("Vincenzo"));
    }

    @Test
    public void testAverageRatingOfAllMovies() {
        RatingMovie ratingMovie = new RatingMovie();
        String title = "Vincenzo";
        String producer =  "leeJang-soo and Cho Soo-young";
        ratingMovie.addMovie(title,producer);
        String titleOne = "Koto Aye";
        String producerOne ="Femi Adebayo";
        ratingMovie.addMovie(titleOne,producerOne);

        ratingMovie.rateMovie("Vincenzo", 4);
        ratingMovie.rateMovie("Vincenzo", 5);
        ratingMovie.rateMovie("Vincenzo", 3);

        ratingMovie.rateMovie("Koto Aye", 5);
        ratingMovie.rateMovie("Koto Aye", 4);

        assertEquals(4.2, ratingMovie.calculateAverageRatingOfAllMovies());
    }

}
