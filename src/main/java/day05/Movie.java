package day05;

import java.time.LocalDate;

public class Movie {
    private String title;
    private int created;
    private int numberOfRates;
    private int sumOfRates;
    private double averageRates;

    public Movie(String title, int created) {
        this.title = title;
        this.created = created;
    }

    public double setRateAndAverageRateOfRates(int rate){
        numberOfRates++;
        sumOfRates += rate;
        averageRates = (sumOfRates* 1.0) / numberOfRates;
        return averageRates;

    }

    public String getTitle() {
        return title;
    }

    public int getCreated() {
        return created;
    }

    public int getNumberOfRates() {
        return numberOfRates;
    }
    public double getAverageRates() {
        return averageRates;
    }
}
