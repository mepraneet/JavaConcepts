///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Problem statement: find common elements from two arrays in Java 
//  Input: Arr1: 11,21,51,101,251,21,55
//  Input: Arr2: 11,13,61,151,34,21,51
//  Output: 11,21,51
//  NOTE : By using collection
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class ArrayX
{
    public int Arr1[]={1,2,3,4,5,6,7,2,5,5};  
    public int Arr2[]={11,21,2,8,5,7,12,5};


    public void FindCommon()
    {
        int iCnt=0;

        HashSet<Integer> hashset= new HashSet<>();
        
        for(iCnt=0; iCnt<Arr1.length; iCnt++)
        {
           for(int i=0; i<Arr2.length; i++)
           {
                if(Arr1[iCnt]== Arr2[i])
                {
                    hashset.add(Arr1[iCnt]); // to avoid muliple duplicate, we store common element in set which not accept duplicate and print 
                                            // like 2 is duplicate in Arr1 
                }
           }
        } 

        for(int iNo: hashset)
        {
            System.out.println(iNo+", ");
        }
    }
}

class program29
{
    public static void main (String A[])
    {
        ArrayX aobj = new ArrayX();

        aobj.FindCommon();

    }
}