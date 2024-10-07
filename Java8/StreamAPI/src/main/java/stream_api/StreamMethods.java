package stream_api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {
    public static void main(String[] args) {

        List<Integer> list = List.of(11, 21, 51, 101);

        Stream<Integer> stream = list.stream();

        //List<Integer> collect = stream.filter(iNo -> iNo > 50).collect(Collectors.toList());

       // System.out.println(collect);

        List<Integer> numSqurae = stream.map(iNo -> iNo * iNo).collect(Collectors.toList());
        System.out.println(numSqurae);

        //============================================================

        List<String> names = List.of("Pranit", "Mukta", "Ishan", "Aai", "Baba");
        Stream<String> stream1 = names.stream();


        List<String> a = stream1.filter(str -> str.startsWith("A")).collect(Collectors.toList());

        System.out.println(a);


    }

}
