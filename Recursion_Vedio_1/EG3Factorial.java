import java.util.*;

class EG3Factorial
{

    public static int calcFactorial(int n)
    {
        if (n == 1 || n == 0) 
        {
            return 1;
        }

         int fact_nm1 = calcFactorial(n-1);
         int fact = n * fact_nm1;

         return fact;

    }


    public static void main(String[] args)
    {
       int n = 5;
       int ans = calcFactorial(n);

       System.out.println(ans);
    }
}