////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statement: Bi-Directional Search
// Bi-Directional Search possible in only in Array and Doubly Linked List
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

    public boolean BiDirectionalSearchX(int iSearch)
    {
        int iStart=0;
        int iEnd=Arr.length-1;
        boolean bFlag=false;

        while(iStart <= iEnd)
        {
            if( Arr[iStart] == iSearch || Arr[iEnd]==iSearch )
            {
                bFlag=true;
                break;
            }
            iStart++;
            iEnd--;
        }
        return bFlag;
    }
}
class BiDirectionalSearch
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

        bRet=aobj.BiDirectionalSearchX(iSearch);

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