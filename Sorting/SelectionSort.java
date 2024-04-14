import java.util.*;

class SelectionSort
{

   public static void SS(int arr[])
   {
       
       for (int i = 0; i < arr.length; i++) 
       {
            int midIndex = i;

            for (int j = i+1; j < arr.length; j++) 
            {
                if (arr[j] < arr[midIndex]) 
                {
                    midIndex = j;
                }
            }

            int smallerNumber = arr[midIndex];
            arr[midIndex] = arr[i];
            arr[i] = smallerNumber;
        
        }

   }
    public static void main(String[] args)
    {

        int [] arr = {3,5,1,9,2,0};

        
        System.out.println("Before Selection Sort : ");
        for (int i : arr) 
        {
            System.out.print(" " + i + " ");
        }
        
        SS(arr); //Function
        
        System.out.println();

        System.out.println("After Selection Sort : ");
        for (int i : arr) 
        {
            System.out.print(" " + i + " ");
        }
    }
}