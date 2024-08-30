///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Problem statement: Find nth postion Largest Number from given array
//  Input: 11,21,51,101,251 (3rd largest)
//  Output: 51
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

    public int NthLargest(int iNo)
    {
        int iCnt=0;
        int temp=0;

        int iPos=iNo-1;

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

            if(iCnt==iPos)
            {
                break;
            }
        }
        return Arr[iPos];        // Logic is same as Second largest just change the index of array, 
                              //because we are decending whole array, so altimatly we get nth position number as largest number as per Array Index
         
    }
}
class program22
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter the elements that you want:");
        int iValue=sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue);
        aobj.Accept();

        System.out.println("Enter the postion of largest element you want:");
        int iValue1=sobj.nextInt();

        iRet=aobj.NthLargest(iValue1);
        aobj.Display();

        System.out.println(iValue1+" Largest Number from Array: "+iRet);
    }
}