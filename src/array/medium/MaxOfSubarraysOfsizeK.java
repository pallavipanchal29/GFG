package array.medium;

import java.util.*;

public class MaxOfSubarraysOfsizeK
{
    public static void main(String[] args)
    {
        int[] arr = new int[] {8, 5 ,10, 7, 9 ,4, 15, 12, 90, 13};
        System.out.println(max_of_subarrays(arr,arr.length,4));
    }
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer> answers = new ArrayList<>();
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        Queue<Integer> queue = new LinkedList<>();
        while (j < n)
        {
            queue.add(arr[j]);
            max = Math.max(max,arr[j]);
            if(j - i + 1 < k)
            {
                j++;
            }
            else
            {
                answers.add(max);
                queue.poll();
                i++;
                j++;
            }
        }
        return answers;
    }
}
