import java.util.*;

class RightSideT2
{
    public static void main(String[] args)
    {
        RS2(5);
    }

    static void RS2(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            for (int j = i; j < n ; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}