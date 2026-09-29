package RatingMoive;

import java.util.Scanner;

public class RatingMoiveApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RatingMovie ratingMovie = new RatingMovie();
        int choice;

        do {
            System.out.println("1. Add a Movie");
            System.out.println("2. Rate a Movie");
            System.out.println("3. View Average Ratings");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");


            choice = input.nextInt();
            input.nextLine();
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the movie name: ");
                    String title = input.nextLine();

                    System.out.print("Enter the producer: ");
                    String producer = input.nextLine();

                    ratingMovie.addMovie(title, producer);

                    System.out.println("The Movie '" + title + " has been added!");
                    break;

                case 2:
                    System.out.print("Enter Favourite movie name: ");
                    String movieTitle = input.nextLine();

                    System.out.print("Rate Your favourite movie from (1-5): ");
                    int rate = input.nextInt();
                    input.nextLine();

                    ratingMovie.rateMovie(movieTitle, rate);

                    System.out.println("Rating added!!!");
                    break;

                case 3:
                    System.out.println("\nAverage Ratings of Your Favourite movie:");

                    for (String movie : ratingMovie.movies) {
                        System.out.println(movie + ": " + ratingMovie.calculateAverageRating(movie));
                    }
                    System.out.println("Average rating of all movies: " + ratingMovie.calculateAverageRatingOfAllMovies());
                    break;

                case 4:
                    System.out.println("Thank you for using the Movie Rating System!");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose 1-4.");
            }

        } while (choice != 4);

    }


        }
