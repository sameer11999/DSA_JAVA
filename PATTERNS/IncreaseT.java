import java.util.*;

class IncreaseT
{
    public static void main(String[] args)
    {
        In(5);
    }

    static void In(int n)
    {
        for ( int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) 
            {
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}