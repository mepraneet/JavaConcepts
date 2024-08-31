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

    public void BubbleSortX()
    {
        int i=0,j=0;
        
        for(i=0; i<Arr.length; i++)
        {
            for(j=0; j<Arr.length-1; j++)
            {
                if(Arr[j] > Arr[j+1])
                {
                    int temp=Arr[j];
                    Arr[j]=Arr[j+1];
                    Arr[j+1]=temp;
                } 
            }
        }

    }
}
class BubbleSort
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

        aobj.BubbleSortX();

        System.out.println("Data After Sorting: ");
        aobj.Display();

        
    }
}