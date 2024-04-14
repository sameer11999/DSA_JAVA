import java.util.*;

class PushatBottom
{
    public static void PushatBottom(int data, Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }

        int top = s.pop();
        PushatBottom(data,s);
        s.push(top);

    }
    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(8);
        s.push(6);

        PushatBottom(4, s);

        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}