import java.util.*;

class ReverseHill
{
    public static void main(String[] args)
    {
        RH(5);
    }

    static void RH(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }

            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}