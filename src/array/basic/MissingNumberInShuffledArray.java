package array.basic;

//Completed GFG - correct
public class MissingNumberInShuffledArray
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{4, 8, 1, 3, 7};
        long[] brr = new long[]{7, 4, 3, 1};
        System.out.println(findMissing(arr,brr, arr.length));
    }
    public static long findMissing(long a[], long b[], int n)
    {
        long sum = 0;
        for(int i = 0;i<n;i++)
            sum = sum + a[i];

        for(int i = 0;i<b.length;i++)
            sum = sum - b[i];

        return sum;
    }
}
