/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Problem Statement: Check wether number is armstrong number or not 
// Armstrong number is a number that is equal to the sum of cubes of its digits. For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
//  Input:  153 = (1*1*1)+(5*5*5)+(3*3*3)             
//  Output:  true      
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class ArmstrongX
{
    public boolean Armstrong(int iNo)
    {
        int iDigit=0, iArm=0;
        int iNum=iNo;

        while(iNo!=0)
        {
            iDigit=iNo%10;
            iArm=iArm+iDigit*iDigit*iDigit;
            iNo=iNo/10;
        }
        if(iArm==iNum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class program9
{
     public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet=false;

        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        ArmstrongX aobj = new ArmstrongX();
        bRet=aobj.Armstrong(iValue);

        if(bRet==true)
        {
            System.out.println("Number is Armstrong Number");
        }
        else
        {
            System.out.println("Number is NOT Armstrong Number");
        }

    }
}