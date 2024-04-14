import java.util.*;

class RightSideT
{
    public static void main(String[] args)
    {
        RS(5);
    }

    static void RS(int n)
    {

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
            
        }
    }
}