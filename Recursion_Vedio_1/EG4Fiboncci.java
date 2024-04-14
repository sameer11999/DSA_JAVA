import java.util.*;

class EG4Fiboncci
{

    public static void calcFic(int a, int b, int n)
    {

        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);

        calcFic(b, c, n-1);
    }
    public static void main(String[] args)
    {
        int a = 0;
        int b = 1;

        System.out.println("a : " + a);
        System.out.println("b : " + b);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        calcFic(a, b, n-2);


    }
}