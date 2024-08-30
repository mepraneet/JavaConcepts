///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Problem statement: find common elements from two arrays in Java 
//  Input: Arr1: 11,21,51,101,251,21,55
//  Input: Arr2: 11,13,61,151,34,21,51
//  Output: 11,21,51
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class ArrayX
{
    public int Arr1[]={11,21,51,141,11,201,251};
    public int Arr2[]={10,11,55,101,300,305,401};


    public void FindCommon()
    {
        int iCnt=0;

        for(iCnt=0; iCnt<Arr1.length; iCnt++)
        {
           for(int i=0; i<Arr2.length; i++)
           {
            if(Arr1[iCnt]== Arr2[i])
            {
                System.out.println("Common Element from Array are: "+Arr2[i]);
            }
           }
        } 
    }
}

class program28
{
    public static void main (String A[])
    {
        ArrayX aobj = new ArrayX();

        aobj.FindCommon();

    }
}