////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Problem Statement: Java program to find number of digits in given number
//  Input:   451245          
//  Output:  6       
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class DigitX
{
    public int Digit(int iNo)
    {
        int iDigit=0, iCount=0;

        while(iNo!=0)
        {
            iDigit=iNo%10;
            iCount++;
            iNo=iNo/10;
        }
        return iCount;
    }
}
class program3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        DigitX dobj = new DigitX();
        iRet=dobj.Digit(iValue);

        System.out.println("Number of digits in number are:"+iRet);
    }
}