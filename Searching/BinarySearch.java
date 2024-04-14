import java.util.*;

class BinarySearch
{
    

     int BS(int arr[], int key)
    {
       
        int start = 0;
        int end = arr.length-1;
        
        int mid = start + (end-start)/2;


        while (start<=end) 
        {
            if (arr[mid] == key) 
            {
                return mid;
            }

            if (key > arr[mid]) 
            {
                start = mid + 1;    
            }

            else
            {
                end = mid - 1;
            }
        }

        return -1;
        //    mid = start + (end-start)/2;


    }

    public static void main(String[] args)
    {
        BinarySearch ob = new BinarySearch();

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter n : ");)
        // int a = sc.nextInt();

        int arr[] = {2,4,6,8,9};

        // System.out.print("Enter Values in Array : ");
        // for (int i = 0; i < arr.length; i++) 
        // {
        //     arr[i] = sc.nextInt();
        // }

        // System.out.println();
        // for (int i = 0; i < arr.length; i++) 
        // {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        int n = arr.length;

        //  Scanner sc = new Scanner(System.in);
        // System.out.println();
        // System.out.println("Enter Key element : ");
        int key = 5;

        int result = ob.BS(arr, key);

        if (result == -1) 
        {
            System.out.println("Element is not present in the array");
        }
        else
        {
            System.out.println(key + " is found at index :" + result);
        }

    }
}