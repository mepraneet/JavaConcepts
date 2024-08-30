////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Problem Statement: Java program to Reverse Number
//  Input:             
//  Output:        
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class ReverseX
{
    public void Reverse(int iNo)
    {
        int iDigit=0, iRev=0;

        while(iNo!=0)
        {
            iDigit=iNo%10;
            iRev=iRev*10+iDigit;
            iNo=iNo/10;
        }

        System.out.println(iRev);
    }
}
class program8
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        ReverseX robj = new ReverseX();
        robj.Reverse(iValue);

    }
}