package problems;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OddEven {
    public static void main(String[] args) {

        List<Integer> number = List.of(2, 4, 5, 8, 7, 9, 6, 4, 3, 10);

        System.out.println("List:"+number);

        Stream<Integer> evenNumber = number.stream();

        List<Integer> EvenNum = evenNumber.filter(iNo -> iNo % 2 == 0).toList();

        System.out.println("Even Numbers are :"+EvenNum);

        Stream<Integer> OddNumber = number.stream();
        List<Integer> OddNum = OddNumber.filter(iNo -> iNo % 2 !=0).toList();

        System.out.println("Odd Numbers are "+OddNum);



    }
}
