package StreamAPI;

import java.util.*;

class Movie1 {
    String name;
    double rating;
    int year;

    Movie1(String n, double r, int y) {
        name = n;
        rating = r;
        year = y;
    }
}
public class Movie {
    public static void main(String[] args) {
        List<Movie1> list = Arrays.asList(
                new Movie1("A", 4.5, 2022),
                new Movie1("B", 4.8, 2023),
                new Movie1("C", 4.2, 2021),
                new Movie1("D", 4.9, 2023),
                new Movie1("E", 4.7, 2022),
                new Movie1("F", 4.6, 2020)
        );

        list.stream()
                .sorted((a, b) -> {
                    if (b.rating == a.rating)
                        return b.year - a.year;
                    return Double.compare(b.rating, a.rating);
                })
                .limit(5)
                .forEach(m -> System.out.println(m.name + " " + m.rating));
    }
}
