///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Problem statement: Find First Duplicate numbers from given array 
//  Input: 11,21,51,101,251,21,51
//  Output: 21
//  NOTE: By Using Collection
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

    public void FirstDuplicate()
    {
        HashSet<Integer> hashset= new HashSet<>();
        int iCnt=0;
        int temp=-1;

        for(iCnt=Arr.length-1;  iCnt>=0; iCnt--)
        {
            if(hashset.contains(Arr[iCnt]))
            {
                temp=iCnt;
            }
            else 
            {
                hashset.add(Arr[iCnt]);
            }
        }

        if(temp != -1)
        {
            System.out.println("First Duplicate Element is : "+Arr[temp]);
        }
        else
        {
            System.out.println("First Duplicate Element not found");
        }
    }

    
}

class program26
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements that you want:");
        int iValue=sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue);
        aobj.Accept();

        aobj.FirstDuplicate();

    }
}