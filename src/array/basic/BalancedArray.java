package array.basic;

//completed GFG - correct
public class BalancedArray
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{1, 5, 3, 2};
        System.out.println(minValueToBalance(arr,arr.length));
    }
    static long minValueToBalance(long a[] ,int n)
    {
        long leftSum = 0;
        long rightSum = 0;
        for(int i = 0;i<n/2;i++)
            leftSum = leftSum + a[i];
        for(int i = n/2;i<n;i++)
            rightSum = rightSum + a[i];

        return Math.abs(leftSum-rightSum);
    }
}
