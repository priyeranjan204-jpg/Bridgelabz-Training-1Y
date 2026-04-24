package LambdaExpression;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("priyeranjan", "harshit", "chintu");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
