////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Problem Statement: Java program to swap two numbers without using third variable
//  Input:             
//  Output:        
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class SwapX
{
    public void Swap(int iNo1, int iNo2)
    {
        System.out.println("Before Swapping iNo="+iNo1+",  iNo2="+iNo2);

        iNo1=iNo1+iNo2;
        iNo2=iNo1-iNo2;
        iNo1=iNo1-iNo2;

        System.out.println("After Swapping  iNo="+iNo1+",  iNo2="+iNo2);
    }
}
class program7
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First Number:");
        int iValue1= sobj.nextInt();

        System.out.println("Enter Second Number:");
        int iValue2= sobj.nextInt();

        SwapX swobj= new SwapX();
        swobj.Swap(iValue1, iValue2);

    }
}