package day05;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie = new Movie("film", 1980);
        System.out.println(movie.setRateAndAverageRateOfRates(5));
        System.out.println(movie.setRateAndAverageRateOfRates(4));
        System.out.println(movie.setRateAndAverageRateOfRates(3));
        System.out.println(movie.setRateAndAverageRateOfRates(2));
        Viewer viewer = new Viewer();
        viewer.watchMovie(movie, 1);
        System.out.println(movie.getAverageRates());

    }
}
