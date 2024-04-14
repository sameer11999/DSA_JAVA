import java.util.*;
public class Strings {

     public static void main(String[] args)
     {
        // String Declaration

        String name = "Sameer";
        String Fullname = "Sameer Walke";
        String Sentense = "Myself Sam";

        System.out.println(Sentense);

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine(); //full line and spaces we take nextline

        // System.out.println("Your name is : " + name);


        // Concatenation and Length
        String fname = "tony";
        String lname = "Stark";

        String fullname = fname +" "+ lname;
        System.out.println(fullname);   
        System.out.println(fullname.length());

        //CharAt

        for (int i = 0; i < fullname.length(); i++) 
        {
            System.out.println(fullname.charAt(i));
        }


        // CompareTo

        String fsname = "ton";
        String lsname = "ton";

        if(fsname.compareTo(lsname) == 0)
        {
            System.out.println("Strings are Equal");
        }

        else
        {
            System.out.println("Strings are not Equal");
        }
 
     }
}