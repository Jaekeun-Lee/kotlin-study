package oop.lec012;

public class JavaFactory {
    private static final int MIN_AGE = 1;

    public static JavaFactory newBaby(String name) {
        return new JavaFactory(name, MIN_AGE);
    }

    private String name;
    private int age;

    private JavaFactory(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
