///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Problem statement: Addition of arrays All elements
//  Input: 10,20,30,40,50
//  Output: 150
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class ArrayX
{
    public int Arr[];

    public ArrayX(int iSize)
    {
        Arr=new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter elements:");
        int iCnt=0;

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            Arr[iCnt]=sobj.nextInt();
        }
    }

    public void Display()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Entered elements are :");
        int iCnt=0;

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

    public int Addition()
    {
        int iCnt=0, iSum=0;

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            iSum=iSum+Arr[iCnt];
        }

        return iSum;
    }
}
class program12
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter number of elements you want: ");
        int iValue=sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue);
        aobj.Accept();
        aobj.Display();

        iRet=aobj.Addition();

        System.out.println("Addition of elements are :"+iRet);
    }
}