////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Problem Statement: Java program to Find Factorial on given Number
//  Input:                  
//  Output:         
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class FactorialX
{
    public int Factorial(int iNo)
    {
        int iCnt=0, iFact=1;

        for(iCnt=1; iCnt<=iNo; iCnt++)
        {
            iFact=iFact*iCnt;
        }
        return iFact;
    }
}
class program2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        FactorialX fobj = new FactorialX();
        iRet=fobj.Factorial(iValue);

        System.out.println("Factorial is:"+iRet);
    }
}