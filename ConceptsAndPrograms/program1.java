////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Problem Statement: Check weather Number is Odd or Even
//  Input:                  5                                            4
//  Output:         Number is Odd                                   Number is even
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class OddEvenX
{
    public boolean OddEven(int iNo)
    {
        if((iNo%2)==0)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}
class program1
{
    public static void main(String A[])
    {
        Scanner sobj= new Scanner(System.in);
        boolean bRet=false;

        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        OddEvenX oeobj= new OddEvenX();
        bRet=oeobj.OddEven(iValue);

        if(bRet==true)
        {
            System.out.println("Number is Even");
        }
        else 
        {
             System.out.println("Number is Odd");
        }

    }
}