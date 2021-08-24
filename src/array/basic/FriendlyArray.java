package array.basic;

import java.util.Arrays;

//Completed GFG - correct
public class FriendlyArray
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{4,1,5};
        System.out.println(sumOfMinAbsDifferences(arr,arr.length));
    }
    static long sumOfMinAbsDifferences(long arr[] ,int N) {
        long sum = 0l;
        Arrays.sort(arr);
        for (int i = 0; i < N; i++) {

            if (i == 0)
                sum += Math.abs(arr[0] - arr[1]);

            else if (i == N - 1)
                sum += Math.abs(arr[N - 1] - arr[N - 2]);

            else {
                long a = Math.abs(arr[i] - arr[i + 1]);
                long b = Math.abs(arr[i] - arr[i - 1]);
                sum += Math.min(a, b);
            }
        }
        return sum;
    }
}
