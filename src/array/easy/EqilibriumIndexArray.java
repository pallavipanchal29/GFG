package array.easy;

public class EqilibriumIndexArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,0,3};
        System.out.println(findEquilibrium(arr,arr.length));
    }
    public static int findEquilibrium(int arr[], int n)
    {
        int sum = 0;
        for(int i = 0;i<n;i++)
            sum = sum + arr[i];

        int leftsum = 0;
        for(int i = 0;i<n;i++)
        {
            sum = sum - arr[i];
            if(sum == leftsum)
                return i;
            leftsum = leftsum + arr[i];
        }

        return -1;
    }
}
