package problems;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {

        Set<Integer> set= new HashSet<>();

        List<Integer> number = List.of(2, 4, 5, 1, 4, 6, 8, 7, 9, 2, 1, 0, 3, 5, 4, 7, 1, 2);

        Set<Integer> duplicate = number.stream().filter(iNo -> !set.add(iNo)).collect(Collectors.toSet());

        System.out.println("Duplicate Elements are :"+duplicate);
    }
}
