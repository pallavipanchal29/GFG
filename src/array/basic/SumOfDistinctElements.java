package array.basic;

import java.util.HashSet;

//Completed GFG - correct
public class SumOfDistinctElements
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(findSum(arr,arr.length));
    }
    static int findSum(int arr[], int n)
    {
       int sum = 0;
       HashSet<Integer> set = new HashSet<>();
       for(int i = 0;i<n;i++)
       {
           if(!set.contains(arr[i]))
               sum = sum + arr[i];
           set.add(arr[i]);
       }
       return sum;
    }
}
