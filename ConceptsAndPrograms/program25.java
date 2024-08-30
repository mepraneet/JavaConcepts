///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Problem statement: Find Duplicate numbers from given array 
//  Input: 11,21,51,101,251,21
//  Output: 21
//  NOTE: By Using Set
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.util.Set;
import java.util.HashSet;

class ArrayX
{
    public int Arr[];

    public ArrayX(int iSize)
    {
        Arr=new int [iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter elements: ");
        int i=0;

        for(i=0; i<Arr.length; i++)
        {
            Arr[i]=sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Enterd elements are: ");
        int i=0;

        for(i=0; i<Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }

    public void FindDuplicate()
    {
        Set<Integer> set = new HashSet<>();

        System.out.println("Duplicate elements are: ");

        for(int iNo : Arr)
        {
            if(set.add(iNo) == false)
            {
                System.out.println(iNo);
            }
        }
    }

    
}

class program25
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements that you want:");
        int iValue=sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue);
        aobj.Accept();

        aobj.FindDuplicate();

    }
}