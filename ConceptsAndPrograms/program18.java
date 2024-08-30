///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Problem statement: Addition of Odd Number from array
//  Input: 10,20,30,40,50
//  Output: 3
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

    public int CountOdd()
    {
        int iCnt=0, iCount=0;

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
        
            if((Arr[iCnt]%2)!=0)
            {
                iCount++;
            }
        }
        return iCount;
    }
}
class program18
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter the elements that you want:");
        int iValue=sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue);
        aobj.Accept();
        iRet=aobj.CountOdd();

        System.out.println("Count of Odd Elemnts are: "+iRet);
    }
}