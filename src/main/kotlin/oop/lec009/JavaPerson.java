package oop.lec009;

import lombok.ToString;

@ToString
public class JavaPerson {

    private final String name;
    private int age;

    public JavaPerson(String name) {
        this(name, 1);
    }

    public JavaPerson(String name, int age) {
        this.name = name;
        this.age = age;
        if (age < 1) {
            throw new IllegalArgumentException(String.format("나이는 1살 이상이어야 합니다"));
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (age < 1) {
            throw new IllegalArgumentException(String.format("나이는 1살 이상이어야 합니다"));
        }
    }

    public boolean isAdult() {
        return this.age >= 19;
    }
}
