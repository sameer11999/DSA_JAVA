import java.util.*;

class DecreaseT
{
    public static void main(String[] args)
    {
       De(5);
    }   

    static void De(int n)
    {   
        for (int i = 0; i < n ; i++) {
            for (int k = i; k < n; k++) {
                System.out.print("* ");
            }
          System.out.println();
        }
    }       
}