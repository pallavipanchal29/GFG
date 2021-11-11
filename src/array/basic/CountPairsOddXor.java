package array.basic;

//Completed GFG - correct
public class CountPairsOddXor
{
    public static void main(String[] args)
    {
        long[] A = new long[]{1, 2, 3};
        System.out.println(countXorPair(A,A.length));
    }
    static long countXorPair(long arr[], int n)
    {
        int odd = 0;
        int even = 0;

        for(int i = 0;i<n;i++)
        {
            if(arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        return odd * even;
    }
}
