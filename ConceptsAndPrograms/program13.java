///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Problem statement: Display Even Elements from Array
//  Input: 10,20,30,40,50
//  Output: 20,40
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

        int i=0;

        for(i=0; i<Arr.length; i++)
        {
            Arr[i]=sobj.nextInt();
        }
    }

    public void DisplayEven()
    {
        int iCnt=0;

        System.out.println("Even elements are :");

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt]%2==0)
            {
                System.out.println(Arr[iCnt]);
            }
        }
    }
}
class program13
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter the number elements that you want");
        int iValue=sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue);
        aobj.Accept();
        aobj.DisplayEven();
    }
}