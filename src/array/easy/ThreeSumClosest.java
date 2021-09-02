package array.easy;

import java.util.Arrays;

//Completed GFG - correct
public class ThreeSumClosest
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{-7,9,8,3,1,1};
        System.out.println(threeSumClosest(arr,2));
    }
    static int threeSumClosest(int[] array, int target)
    {
        Arrays.sort(array);
        int closestSum = Integer.MAX_VALUE;

        for(int i = 0;i<array.length-2;i++)
        {
            int low = i+1;
            int high = array.length-1;

            while (low < high)
            {
                int sum = array[i] + array[low] + array[high];
               closestSum = Math.min(Math.abs(target - sum),Math.abs(target - closestSum));

                if (sum > target)
                    high--;
                else
                    low++;
            }
        }
        return closestSum;
    }
}
