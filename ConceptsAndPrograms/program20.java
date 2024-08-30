///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Problem statement: Find Second Largest Number from given array
//  Input: 11,21,51,101,251
//  Output: 101
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

    public int SecondLargest()
    {
        int iCnt=0;
        int temp=0;

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            for(int i=iCnt+1; i<Arr.length; i++)
            {
                if(Arr[iCnt] < Arr[i])  // it swap index 0 and 1 into decending order
                {
                    temp=Arr[iCnt];
                    Arr[iCnt]=Arr[i];
                    Arr[i]=temp;
                }
            }
        
            if(iCnt==1) // if we dont put break it will iterate all elemnts , but we know we get our largest elemnt at index pos 1 so we break at pos no 1;
            {
                break;
            }
            
        }
        return Arr[1];
         
    }
}
class program20
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter the elements that you want:");
        int iValue=sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue);
        aobj.Accept();
        iRet=aobj.SecondLargest();
        aobj.Display();

        System.out.println("Second Largest Number from Array: "+iRet);
    }
}