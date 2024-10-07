package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Q: Create list of numbers and filter even numbers

        List<Integer> list1=List.of(2,4,50,21,22,67);
       // list1.add(45);

        //System.out.println(list1);

        List<Integer> list2= new ArrayList<>();
        list2.add(11);
        list2.add(21);
        list2.add(51);
        list2.add(101);

        //System.out.println(list2);

        //Without stream

        List<Integer> EvenList=new ArrayList<>();

        for(Integer iNo : list1)
        {
            if(iNo%2==0)
            {
                EvenList.add(iNo);
            }
        }

        System.out.println(list1);
        System.out.println(EvenList);
        
        //Using stream

        Stream<Integer> stream = list1.stream();
        List<Integer> newList = stream.filter(iNo -> iNo % 2 == 0).toList();

        System.out.println("Using stream: "+newList);
    }
}
