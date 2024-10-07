package stream_api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String Args[])
    {
        System.out.println("Jay Ganesh...");

        List<Integer> list = List.of(11, 21, 51, 101, 24, 12);

        Stream<Integer> stream = list.stream();
        List<Integer> EvenList = stream.filter(iNo -> iNo % 2 == 0).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(EvenList);


    }
}
