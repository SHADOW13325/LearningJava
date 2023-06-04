package com.example.Java8Features.Streams.SampleTest;

/**
 * @author saumitra chauhan
 */

public class RandomIds{
    int id;
    int randomNumbers;

    public RandomIds(int id, int randomNumbers) {
        this.id = id;
        this.randomNumbers = randomNumbers;
    }

    @Override
    public String toString() {
        return "RandomIds{" +
                "id=" + id +
                ", randomNumbers=" + randomNumbers +
                '}';
    }
}