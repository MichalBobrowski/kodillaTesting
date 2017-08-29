package com.kodilla.good.patterns.challenges;

public class MovieMain {

    public static void main(String args[]) {

        MovieStore movieStore = new MovieStore();

        movieStore.getMovies().entrySet().stream().
                flatMap(s -> s.getValue().stream())
                .map(s-> s + " ! ")
                .forEach(System.out::print);
    }
}
