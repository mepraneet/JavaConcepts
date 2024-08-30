////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Problem Statement: Check wether number is pallindrome or not
//  Input:        1001     
//  Output:        true
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class PallindromeX
{
    public boolean Pallindrome(int iNo)
    {
        int iDigit=0, iRev=0;
        int iNum=iNo;

        while(iNo!=0)
        {
            iDigit=iNo%10;
            iRev=iRev*10+iDigit;
            iNo=iNo/10;
        }

        if(iNum==iRev)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}
class program10
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet=false;

        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        PallindromeX pobj = new PallindromeX();
        bRet=pobj.Pallindrome(iValue);

        if(bRet==true)
        {
            System.out.println("Number is Pallindrome");
        }
        else 
        {
             System.out.println("Number is NOT Pallindrome");
        }

    }
}