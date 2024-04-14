import java.util.*;

class Multilevel
{
    public static void main(String[] args)
    {
        Equi e = new Equi();
        e.area();
        e.areat(4, 5);
        e.areae(3, 4);
    }
}

class Shape
{
    public void area()
    {
        System.out.println("display area");
    }
}

class Triangle extends Shape
{
    public void areat(int l, int h)
    {
        int result = l*h/2;
        System.out.println(result);
    }
}

class Equi extends Triangle
{
    void areae(int l, int h)
    {
        int result = l*h/2;
        System.out.println(result);
    }
}