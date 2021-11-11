package array.basic;

import java.util.HashMap;

//Completed GFG - correct
public class JaysApples
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 1, 1, 1, 1};
        System.out.println(minimum_apple(arr,arr.length));
    }
    // Function for finding maximum and value pair
    public static int minimum_apple (int arr[], int n)
    {
        int min = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                min++;
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }

        }
        return min;
    }
}
