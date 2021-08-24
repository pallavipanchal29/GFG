package array.basic;

public class MissingNumber
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{2, 5, 3, 1};
        System.out.println(missingNumber(arr,arr.length));
    }
    public static int missingNumber(int a[], int n)
    {
        int x1 = a[0];
        int x2 = 1;

        for (int i = 1; i < n; i++)
            x1 = x1 ^ a[i];

        for (int i = 2; i <= n + 1; i++)
            x2 = x2 ^ i;

        return (x1 ^ x2);
    }
}
