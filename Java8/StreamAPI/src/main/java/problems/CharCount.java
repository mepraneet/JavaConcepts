package problems;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

    public static void countChar(String str)
    {
        Map<Character,Integer> map= new HashMap<>();

        char Arr[]=str.toCharArray();

        for(char ch :Arr)
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
        System.out.println(str+" : "+map);


    }


    public static void main(String[] args) {

        countChar("test");
    }
}
