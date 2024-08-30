///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Problem statement: Find Maximum Number from given array
//  Input: 11,21,51,101,251
//  Output: 251
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class ArrayX
{
    public int Arr[];

    public ArrayX(int iSize)
    {
        Arr=new int [iSize];
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

    public int Maximum()
    {
        int iCnt=0;
        int iMax=Arr[0];

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt]>iMax)
            {
                iMax=Arr[iCnt];
            }  
        } 
        return iMax-1;    
    }
}
class program19
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet=0;

        System.out.println("Enter the elements that you want:");
        int iValue=sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue);
        aobj.Accept();
        iRet=aobj.Maximum();

        System.out.println("Maximum Number from Array: "+iRet);
    }
}