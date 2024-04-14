import java.util.*;

class EG5StackHeight
{

    public static int stackHeight(int x, int n)
    {
        if (n == 1) {
            return 1;
        }

        if (n == 0) {
            return 0;
        }

        int pownm1 = stackHeight(x,n-1);
        int xpow = x * pownm1;

        return xpow;

    }

    public static void main(String[] args)
    {
        int x = 2, n = 4;
        int ans = stackHeight(x,n);
        System.out.println("The power of x^n (" + x + "^" + n + ") is : "  + ans);
    }
}