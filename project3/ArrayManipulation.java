package project3;
import java.util.Arrays;

import java.util.Arrays; 
import java.util.List;

public class ArrayManipulation {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0) // Filter odd numbers
                .toList();

        List<Integer> squares = oddNumbers.stream()
                .map(n -> n * n) // Square the numbers
                .toList();

        int sum = squares.stream()
                .mapToInt(Integer::intValue) // Convert to IntStream
                .sum();                      // Calculate sum

       
        System.out.println(sum);
    }
}
