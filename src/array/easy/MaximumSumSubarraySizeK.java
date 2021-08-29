package array.easy;

import java.util.ArrayList;

//Completed GFG - correct
public class MaximumSumSubarraySizeK
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(100);
        arr.add(200);
        arr.add(300);
        arr.add(400);
        System.out.println(maximumSumSubarray(4,arr,arr.size()));
    }
    static int maximumSumSubarray(int K, ArrayList<Integer> Arr,int N)
    {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;

        while (j < N)
        {
            sum = sum + Arr.get(j);
            if(j - i + 1 < K)
                j++;
            else
            {
                max = Math.max(sum,max);
                sum = sum - Arr.get(i);
                i++;
                j++;
            }
        }
        return max;
    }
}
