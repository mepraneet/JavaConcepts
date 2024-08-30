///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Problem statement: All in one Programs
//  Input: 
//  Output: 
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class DigitX
{
    public boolean OddEven(int iNo)
    {
        boolean bFlag=false;

        if((iNo%2)==0)
        {
            bFlag=true;
        }

        return bFlag;   
    }

    public int Factorial(int iNo)
    {
        int iCnt=0, iFact=1;

        for(iCnt=1; iCnt<=iNo; iCnt++)
        {
           
            iFact=iFact*iCnt;

        }
        return iFact;
    }

    public int CountDigit(int iNo)
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

    public boolean CheckPrime(int iNo)
    {
        int iCnt=0;
        boolean bFlag=false;

        for(iCnt=2; iCnt<=(iNo/2); iCnt++)
        {
            if(iNo%iCnt==0)
            {
                bFlag=true;
            }
        }
        return bFlag;
    }

    public void Fibonacci(int iNo)
    {
        int iCnt=0, first=0, second=1, next=0;

        for(iCnt=1; iCnt<=iNo; iCnt++)
        {
            System.out.println(first+" ");
    
            next=second+first;
            first=second;
            second=next;
        }
    }

    public void Swap(int iNo1, int iNo2)
    {
        System.out.println("Number before Swap: iNo1: "+iNo1+", iNo2: "+iNo2);

        iNo1=iNo1+iNo2;
        iNo2=iNo1-iNo2;
        iNo1=iNo1-iNo2;

         System.out.println("Number After Swap: iNo1: "+iNo1+", iNo2: "+iNo2);

    }

    public void ReversNumber(int iNo)
    {
        int iDigit=0, iRev=0;

        while(iNo!=0)
        {
            iDigit=iNo%10;
            iRev=iRev*10+iDigit;
            iNo=iNo/10;
        }

        System.out.println("Reverse Number is: "+iRev);

    }

    public boolean CheckArmstrong(int iNo)
    {
        int iDigit=0, iArm=0;
        boolean bFlag=false;
        int iNum=iNo;

        while(iNo!=0)
        {
            iDigit=iNo%10;
            iArm=iArm+iDigit*iDigit*iDigit;
            iNo=iNo/10;
        }

        if(iNum==iArm)
        {
            bFlag=true;
        }

        return bFlag;  

    }

    public boolean CheckPallindrome(int iNo)
    {
        int iDigit=0, iRev=0;
        boolean bFlag=false;

        int iNum=iNo;

        while(iNo!=0)
        {
            iDigit=iNo%10;
            iRev=iRev*10+iDigit;
            iNo=iNo/10;
        }

        if(iNum==iRev)
        {
            bFlag=true;
        }

        return bFlag; 

    }
}
class program11
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        DigitX dobj = new DigitX();
        
    }
}