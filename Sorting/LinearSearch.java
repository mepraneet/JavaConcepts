////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statement: Linear Search
////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class ArrayX
{
    public int Arr[];

    public ArrayX(int iSize)
    {
        Arr=new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter elements: ");
        int i=0;
        for(i=0; i<Arr.length; i++)
        {
            Arr[i]=sobj.nextInt();
        }
    }

    public void Display()
    {
        int i=0;
        System.out.println("Entered elements are:");
        for(i=0; i<Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }

    public boolean LinearSearchX(int iSearch)
    {
        int iCnt=0;
        boolean bFlag=false;

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt]== iSearch)
            {
                bFlag=true;
                break;
            }
        }
        return bFlag;
    }
}
class LinearSearch
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet=false;

        System.out.println("Enter number of elements you want : ");
        int iValue=sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue);
        aobj.Accept();
        
        System.out.println("Enter number that you want to search: ");
        int iSearch=sobj.nextInt();

        bRet=aobj.LinearSearchX(iSearch);

        if(bRet==true)
        {
            System.out.println("Number is Present in Array");
        }
        else 
        {
            System.out.println("Number is Not Present in Array");
        }
    }
}