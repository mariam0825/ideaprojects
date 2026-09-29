package RatingMoive;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class RatingMovie {

    ArrayList<String> movies = new ArrayList<>();
    ArrayList<LocalDateTime> movieDates =new ArrayList<>();
    ArrayList<ArrayList<Integer>> moviesRating = new ArrayList<>();
    public void addMovie(String title, String producer) {
        for(String movieTitle : movies){
            if(movieTitle.equalsIgnoreCase(title)){
                return;
            }
        }
        movies.add (title);
        movieDates.add(LocalDateTime.now());
        ArrayList<Integer> ratings = new ArrayList<>();
        moviesRating .add(ratings);
    }

    public int checkNumberOfMovieAvailable() {
        return movies.size();
    }

    public LocalDateTime checkDate(String title) {
        LocalDateTime time = LocalDateTime.now();
        for(int index = 0; index <checkNumberOfMovieAvailable(); index++ ) {
            if (movies.get(index) == title) {
                time = movieDates.get(index);
            }
        }
        return time;
    }

    public void rateMovie(String title, int rate) {
        if(rate > 5 || rate <  1) System.out.println("Rating must be in range 1-5 !!! ");
        else{
            for (int index = 0; index < movies.size(); index++) {
                if (movies.get(index).equalsIgnoreCase(title)) {
                    moviesRating.get(index).add(rate);
                }
            }
            }
    }

    public double calculateAverageRating(String title) {
        for (int index = 0; index < movies.size(); index++) {
            if (movies.get(index).equalsIgnoreCase(title)) {
                int total = 0;
                for (int rating : moviesRating.get(index)) {
                    total += rating;
                }
                if (moviesRating.get(index).size() == 0) {
                    return 0.0;
                }
                double average = (double) total / moviesRating.get(index).size();

                return average;
            }
        }

        return 0.0;
    }

    public double calculateAverageRatingOfAllMovies() {
        int total = 0;
        int count = 0;
        for (int index = 0; index < moviesRating.size(); index++) {
            for (int rating : moviesRating.get(index)) {
                total += rating;
                count++;
            }
        }
        if (count == 0) {
            return 0.0;
        }
        double totalAverage = (double) total / count;

        return totalAverage;
    }
}

