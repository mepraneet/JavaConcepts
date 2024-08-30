////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Problem Statement: Java program to find Fibonacci series upto a given number range
//  Input:  8            
//  Output:   0, 1, 1, 2, 3, 5, 8, 13     
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
class FibonacciX
{
    public void Fibonacci(int iNo)
    {
        int iCnt=0,first=0, second=1, next=0;

        for(iCnt=1; iCnt<=iNo; iCnt++)
        {
            System.out.println(first+" ");
            next=second+first;
            first=second;
            second=next;
        }
    }
}
class program6
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number:");
        int iValue=sobj.nextInt();

        FibonacciX fobj = new FibonacciX();
        fobj.Fibonacci(iValue);
    }
}
