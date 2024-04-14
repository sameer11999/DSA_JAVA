import java.util.*;

class EG6LogN
{

    public static int stackHeight(int x, int n)
    {
        if (n == 0) {
            return 1;
        }

        if (x == 0) {
            return 0;
        }

        if (n % 2 == 0) 
        {
            return stackHeight(x, n/2) * stackHeight(x, n/2);
        }

        else
        {
            return stackHeight(x, n/2) * stackHeight(x, n/2) * x;
        }

    }

    public static void main(String[] args)
    {
        int x = 2, n = 5;
        int ans = stackHeight(x,n);
        System.out.println("The power of x^n (" + x + "^" + n + ") is : "  + ans);
    }
}