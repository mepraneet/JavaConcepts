package problems;

import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {

        //Average of List using stream
        List<Integer> list=List.of(11,21,51,101,151,200,201);

        double asDouble = list.stream().mapToInt(iNo -> iNo).average().getAsDouble();
        System.out.println(asDouble);

        //Square of each number from list

    }
}
