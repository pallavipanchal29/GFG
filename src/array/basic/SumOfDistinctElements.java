package array.basic;

import java.util.HashSet;

//Completed GFG - correct
public class SumOfDistinctElements
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{5, 1, 2, 4, 6, 7, 3, 6, 7};
        System.out.println(findSum(arr,arr.length));
    }
      //O(n) space and O(n) time complexity
//    static int findSum(int arr[], int n)
//    {
//       int sum = 0;
//       HashSet<Integer> set = new HashSet<>();
//       for(int i = 0;i<n;i++)
//       {
//           if(!set.contains(arr[i]))
//               sum = sum + arr[i];
//           set.add(arr[i]);
//       }
//       return sum;
//    }

    //O(1) space & O(n) complexity solution
    static int findSum(int arr[], int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++) {

            if (arr[Math.abs(arr[i]) - 1] >= 0) {
                sum += Math.abs(arr[i]);
                arr[Math.abs(arr[i]) - 1] *= -1;
            }
        }

        return sum;
    }
}
