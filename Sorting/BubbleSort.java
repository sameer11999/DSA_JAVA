import java.util.*;

class BubbleSort
{
    public static void main(String[] args)
    {
        int arr[] = {5,3,8,1,9,0};

        BubbleSort b = new BubbleSort();

        System.out.println("Before Sort :");
        b.print(arr);

        b.BS(arr);

        System.out.println();

        System.out.println("After Sort : ");
        b.print(arr);
        

    }

    public static void print(int arr[])
    {
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println(" " + arr[i] + " ");
        }
    }

    public static void BS(int arr[])
    {

        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i+1; j < arr.length; j++) 
            {
                if (arr[i] > arr[j]) 
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;   
                }
            }
        }
    }

}