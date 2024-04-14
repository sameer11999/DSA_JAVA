import java.util.*;

class StringBuild {

     public static void main(String[] args)
     {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(2));

        // set char At index 3
        sb.setCharAt(0,'P');
        System.out.println(sb);

        // insert 

        sb.insert(3,'R');
        System.out.println(sb);

        sb.setCharAt(0,'H');
        System.out.println(sb);

        // Delete 
        sb.delete(0, 1);
        System.out.println(sb);
        sb.delete(3, 4);
        System.out.println(sb);

        // append

        StringBuilder a = new StringBuilder("h");
        a.append("e");
        a.append("l");
        a.append("l");
        a.append("o");

        System.out.println(a);

        

     }
}