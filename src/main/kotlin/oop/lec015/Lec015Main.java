package oop.lec015;

import java.util.Arrays;
import java.util.List;

public class Lec015Main {

    public static void main(String[] args) {
        int[] arr = {100, 200};
        final List<Integer> numbers = Arrays.asList(100, 200);

        final List<Integer> nums = List.of(100, 200);
        nums.forEach(System.out::println);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s : %s \n", i, arr[i]);
        }

        numbers.forEach(System.out::println);
    }
}
