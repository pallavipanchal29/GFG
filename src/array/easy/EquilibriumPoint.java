package array.easy;

//Completed GFG - correct
public class EquilibriumPoint
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{1};
        System.out.println(equilibriumPoint(arr,arr.length));
    }
    public static int equilibriumPoint(long arr[], int n)
    {
        long sum = 0;
        long leftSum = 0;

        for(int i = 0;i<n;i++)
        {
            sum = sum + arr[i];
        }
        for(int i = 0;i<n;i++)
        {
            sum = sum - arr[i];
            if(sum == leftSum)
                return (i +1);
            leftSum = leftSum + arr[i];
        }
        return -1;
    }
}
