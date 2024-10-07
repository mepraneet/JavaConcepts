package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Array {

    public static void charCount(String str)
    {
        Map<Character, Integer> map= new HashMap<>();

        str=str.trim();
        str=str.replaceAll("\s+","");

        char[] Arr = str.toCharArray();

        for(char ch : Arr)
        {
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }
        System.out.println(str+":"+map);

    }
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String str=sobj.nextLine();

        charCount(str);

    }
}
