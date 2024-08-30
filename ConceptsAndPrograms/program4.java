////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Problem Statement: Java program to calculate the sum of Digits of a number
//  Input:   451245          
//  Output:  21      
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class SumDigitX
{
    public int SumDigit(int iNo)
    {
        int iDigit=0, iSum=0;

        while(iNo!=0)
        {
            iDigit=iNo%10;
            iSum=iSum+iDigit;
            iNo=iNo/10;
        }
        return iSum;
    }
}
class program4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        SumDigitX dobj = new SumDigitX();
        iRet=dobj.SumDigit(iValue);

        System.out.println("Sum of Digit are:"+iRet);
    }
}