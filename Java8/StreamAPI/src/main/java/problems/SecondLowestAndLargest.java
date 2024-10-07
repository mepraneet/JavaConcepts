package problems;

import java.util.Collections;
import java.util.List;

public class SecondLowestAndLargest {

    public static void main(String[] args) {

        List<Integer> number = List.of(11, 21, 51, 101, 12, 45, 89, 77, 65, 55);

        //Second Highest
        Integer secondHighest = number.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println("Second Highest Number is :"+secondHighest);


        //Second Lowest
        Integer secondLowest = number.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println("Second Smallest Number is :"+secondLowest);




    }
}
