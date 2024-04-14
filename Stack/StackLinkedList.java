import java.util.*;

public class StackLinkedList
{
    static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {   
            this.data = data;
            next = null;
        }
    }

    static class stack
    {
        public static Node head;
        
        public static boolean isEmpty()
        {
            return head == null;
        }
        
        public static void push(int data)
        {
            Node newNode = new Node(data);

            if (isEmpty()) 
            {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public static int pop()
        {
            if (isEmpty()) 
            {
                return -1;
            }
            int top = head.data;
            head = head.next ;
            return top;
        }

        public static int peek()
        {
            if (isEmpty()) 
            {
                return -1;
            }

            return head.data;

        }

    }
    public static void main(String[] args)
    {
        Stack s = new Stack();
        s.push(3);
        s.push(5);
        s.push(7);
        s.push(9);

        while (!s.isEmpty()) 
        {
            System.out.println(s.peek());
            s.pop();    
        }
    }
}