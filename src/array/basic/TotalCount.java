package array.basic;

//Completed GFG - correct
public class TotalCount
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{10, 2, 3, 4, 7};
        System.out.println(totalCount(arr,arr.length,4));
    }
    static int totalCount(int[] arr, int n, int k)
    {
        int sum = 0;
        for(int i = 0;i<n;i++)
        {
            int count = 0;
            int temp = arr[i];
            while (temp > k)
            {
                temp = temp - k;
                count++;
            }
            if(temp <= k)
                count++;
            sum = sum + count;
        }
        return sum;
    }
}
