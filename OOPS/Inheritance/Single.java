import java.util.*;

class Single
{
    public static void main(String[] args)
    {
        Triangle t = new Triangle();
        t.area();
        t.area(4, 7);
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
    public void area(int l, int h)
    {
        System.out.println((l*h)/2);
    }
}