package problems;

import java.util.Comparator;
import java.util.List;

public class MinMaxNumber {
    public static void main(String[] args) {

        List<Integer> number = List.of(11, 21, 51, 101, 12, 45, 89, 77, 65, 55);

        Integer maxNum = number.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Maximum Number is :"+maxNum);

        Integer minNum = number.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Minimum Number is:"+minNum);


    }
}
