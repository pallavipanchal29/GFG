package array.easy;

//Completed GFG - correct
public class SumOfLengthNonOverlappingSubarray
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{2, 1, 4, 9, 2, 3, 8, 3, 4};
        System.out.println(calculateMaxSumLength(arr,arr.length,4));
    }
    static long calculateMaxSumLength(long arr[], int N,int K)
    {
        int ans = 0;
        int count = 0;

        int flag = 0;

        for (int i = 0; i < N;) {
            count = 0;
            flag = 0;

            while (i < N && arr[i] <= K) {
                count++;
                if (arr[i] == K)
                    flag = 1;
                i++;
            }

            if (flag == 1)
                ans += count;

            while (i < N && arr[i] > K)
                i++;
        }
        return ans;
    }
}
