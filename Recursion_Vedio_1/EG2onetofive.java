import java.util.*;

class EG2onetofive
{

    public static void printNumb(int n)
    {
        if (n == 6) 
        {
           return; 
        }

        System.out.println(n);
        printNumb(n+1);
    }

    public static void main(String[] args)
    {
        // int n = 5;
        printNumb(1);
    }
}