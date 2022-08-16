package fp.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {
        List<JavaFruit> javaFruits = List.of(
                new JavaFruit("사과", 1_000),
                new JavaFruit("사과", 1_200),
                new JavaFruit("사과", 1_200),
                new JavaFruit("사과", 1_400),
                new JavaFruit("사과", 1_400),
                new JavaFruit("사과", 1_700),
                new JavaFruit("바나나", 2_100),
                new JavaFruit("바나나", 2_300),
                new JavaFruit("바나나", 2_300),
                new JavaFruit("수박", 10_500),
                new JavaFruit("수박", 13_500)
        );

        List<JavaFruit> apples = javaFruits.stream().filter(javaFruit -> javaFruit.getName().equals("사과")).collect(Collectors.toList());
        apples.forEach(System.out::println);

        List<JavaFruit> bananas = new MainApp().filterFruits(javaFruits, javaFruit -> javaFruit.getName().equals("바나나"));
        bananas.forEach(System.out::println);

    }

    private List<JavaFruit> filterFruits(List<JavaFruit> fruits, Predicate<JavaFruit> fruitsFilter) {
        List<JavaFruit> results = new ArrayList<>();
        for (JavaFruit fruit : fruits) {
            if (fruitsFilter.test(fruit)) {
                results.add(fruit);
            }
        }

        return results;
    }
}
