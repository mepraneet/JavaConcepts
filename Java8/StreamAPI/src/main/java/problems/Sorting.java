package problems;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorting {
    public static void main(String[] args) {

        List<Integer> number = List.of(11, 21, 51, 101, 12, 45, 89, 77, 65, 55);

        //Assending Order
        List<Integer> AscNum = number.stream().sorted().collect(Collectors.toList());
        System.out.println(AscNum);

        //Decending Order

        List<Integer> DecNum = number.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(DecNum);

    }
}
