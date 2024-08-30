///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Problem statement: Find the element that appear only once in an Array 
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

    public void AppearOnce()
    {
        int result=Arr[0];
        int iCnt=0;

        for(iCnt=1; iCnt<Arr.length; iCnt++)
        {
            result=result^Arr[iCnt];
        }
        System.out.println("Single repeated element is: "+result);
    }

    
}

class program27
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements that you want:");
        int iValue=sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue);
        aobj.Accept();

        aobj.AppearOnce();

    }
}