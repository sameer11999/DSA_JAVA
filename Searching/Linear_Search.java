import java.util.Scanner;

public class Linear_Search
{    

    public static void main(String a[])
    {   
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        
        int[] arr= new int[n]; 
        
        System.out.println();
        System.out.println("Enter the values in the Array : ");
        System.out.println();

        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }   

        for (int i = 0; i < n; i++) 
        {
            System.out.print("[" + arr[i] + "]");
        }

        System.out.println();
        System.out.println();
        System.out.println("Enter element to be Searched : ");
        int key = sc.nextInt();    

        System.out.println();
        if (key) {
            
        } else {
            
        }
        System.out.print(key+" is found at index: "+Linear_Search(arr, key));    
    }    

    public static int Linear_Search(int[] arr, int key)
{    
        for(int i=0;i<arr.length;i++)
        {    
            if(arr[i] == key)
            {    
                return i;    
            }    
        }    
        return -1;    
    }    
}