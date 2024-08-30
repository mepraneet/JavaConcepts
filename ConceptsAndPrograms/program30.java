///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Problem statement: Find first and last element of Arraylist 
//  Input: Pune,Mumbai,Nashik,Satara,Kolhapur
//  Output: Pune,Kolhapur
//  
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.util.ArrayList;

class ArrayX
{
    public void FirstAndLast()
    {
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("Pune");
        arraylist.add("Mumbai");
        arraylist.add("Nashik");
        arraylist.add("Satara");
        arraylist.add("Kolhapur");
        

        if(!arraylist.isEmpty())
        {
            String firstElement=arraylist.get(0);
            String lastElement=arraylist.get(arraylist.size()-1);

            System.out.println("First Element :"+firstElement);
            System.out.println("Last Element :"+lastElement);
        }
        else 
        {
            System.out.println("ArrayList is Empty");
        }
    }

    
}

class program30
{
    public static void main (String A[])
    {
        ArrayX aobj = new ArrayX();

        aobj.FirstAndLast();

    }
}