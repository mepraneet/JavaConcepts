///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Problem statement: Find Duplicate numbers from given array 
//  Input: 11,21,51,101,251,21
//  Output: 21
//  NOTE: ** Applicable only when there is not more than 2 duplicate values **
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

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
        int iCnt=0;

        System.out.println("Duplicate elements are: ");

        for(iCnt=0; iCnt<Arr.length-1; iCnt++)
        {
            for(int i=iCnt+1; i<Arr.length; i++)
            {
                if(Arr[iCnt] == Arr[i]  &&  iCnt != i)  // Arr[iCnt] == Arr[i] : it will compare index by index and || iCnt != i : this is for to avoide self duplicate showing 
                {
                    System.out.println(Arr[i]);
                }
            }
            
        }       
         
    }
}
class program24
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