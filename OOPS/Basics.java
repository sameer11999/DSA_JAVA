
class Pen
{
    String color;
    String type; //ballpen; gel

    public void write()
    {
        System.out.println("Writing Something");
    }

    public void printColor()
    {
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

class Student
{
    String name;
    int age;

    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // parameterized constructer
    // Student(String name, int age)
    // {
    //    this.name = name;
    //    this.age = age;
    // }

    // copy
    Student(Student s2)
    {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student()
    {

    }
}

public class Basics
{
    public static void main(String[] args)
    {
        // Pen pen1 = new Pen();
        // pen1.color = "Blue";
        // pen1.type = "Gel";
        
        // pen1.write();

        
        // Pen pen2 = new Pen();
        // pen2.color = "Black";
        // pen2.type = "ballpoint";
        
        // pen1.printColor();
        // pen2.printColor(); 

        Student s1 = new Student();
        s1.name = "Sameer";
        s1.age = 22;

        Student s2 = new Student(s1);
        s2.printInfo();
    }
}