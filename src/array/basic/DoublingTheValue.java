package array.basic;

//Completed GFG - correct
public class DoublingTheValue
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{1 ,2 ,3, 4, 8};
        System.out.println(solve(arr.length,arr,3));
    }
    static long solve(int n, long A[], long b)
    {
        int i = 0;
        while (i < n)
        {
            if(A[i] == b)
            {
                b = b * 2;
            }
            i++;
        }
        return b;
    }
}
