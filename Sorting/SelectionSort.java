////////////////////////////////////////////////////////////////////////////////////////////////////
// Problem Statement: Selection sort
// 
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

    public void SelectionSortX()
    {
        int i=0,j=0,minIndex=0;
        
        for(i=0; i<Arr.length-1; i++)
        {
            minIndex=i;

            for(j=i+1; j<Arr.length; j++)
            {
                if(Arr[j] < Arr[minIndex])
                {
                    minIndex=j;
                } 
            }
            int temp=Arr[i];
            Arr[i]=Arr[minIndex];
            Arr[minIndex]=temp;
        }

    }
}
class SelectionSort
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements you want : ");
        int iValue=sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue);
        aobj.Accept();

        System.out.println("Data Before Sorting: ");
        aobj.Display();

        aobj.SelectionSortX();

        System.out.println("Data After Sorting: ");
        aobj.Display();

        
    }
}