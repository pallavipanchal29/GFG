package array.basic;

//Completed GFG - correct
public class LargestProduct
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4};
        System.out.println(findMaxProduct(arr,arr.length,2));
    }
    static long findMaxProduct(int A[], int n, int k)
    {
        Long max = Long.MIN_VALUE;
        if (k > n)
            return -1;
        long product = 1L;
        int i = 0;
        int j = 0;

        while (j < n)
        {
            if(j - i < k) {
                product = product * A[j];
                j++;
            }
            else
            {
                max = Math.max(product,max);
                product = product / A[i];
                i++;
            }
        }
        return Math.max(max,product);
    }
}
