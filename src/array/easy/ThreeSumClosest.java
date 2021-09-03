package array.easy;

import java.util.Arrays;

//Completed GFG - correct
public class ThreeSumClosest
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{5, 2, 7, 5};
        System.out.println(threeSumClosest(arr,13));
    }
    static int threeSumClosest(int[] nums, int target)
    {
        Arrays.sort(nums);
        int closet = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++)
        {
            int left = i+1;
            int right = nums.length-1;
            while(left<right)
            {
                int sum = nums[left]+nums[right]+nums[i];
                if(Math.abs(sum-target) < Math.abs(closet-target))
                    closet = sum;

                if(sum>target)
                    right--;
                else if(sum<target)
                    left++;
                else
                    return sum;
            }
        }
        return closet;
    }
}
