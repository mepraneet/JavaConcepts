////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Problem Statement: Check wether number is prime or not
//  Input:             
//  Output:        
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class CheckPrimeX
{
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
}

class program5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet=false;

        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        CheckPrimeX cobj= new CheckPrimeX();
        bRet=cobj.CheckPrime(iValue);

        if(bRet==true)
        {
            System.out.println("Number is NOT Prime");
        }
        else 
        {
            System.out.println("Number is Prime");
        }
    }
}