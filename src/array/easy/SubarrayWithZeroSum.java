package array.easy;

import java.util.HashSet;

//Completed GFG - correct
public class SubarrayWithZeroSum
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{10,-10};
        System.out.println(findsum(arr,arr.length));
    }
//    static boolean findsum(int[] arr, int n)
//    {
//        int curr_sum = arr[0], start = 0, i;
//
//        for (i = 1; i <= n; i++) {
//            while (curr_sum > 0 && start < i - 1) {
//                curr_sum = curr_sum - arr[start];
//                start++;
//            }
//
//            if (curr_sum == 0) {
//               return true;
//            }
//
//            if (i < n)
//                curr_sum = curr_sum + arr[i];
//        }
//        return false;
//    }
    static boolean findsum(int[] arr, int n)
    {
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        for(int i = 0;i<n;i++)
        {
            sum = sum + arr[i];
            if(set.contains(sum))
                return true;
            else
                set.add(sum);
        }
        return false;
    }
}
