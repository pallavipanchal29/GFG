package array.basic;

//Completed GFG - correct
public class MultiplyLeftRightArraySum
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2};
        System.out.println(multiply(arr,arr.length));
    }
    public static int multiply (int arr[], int n)
    {
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0;i<n/2;i++)
            leftSum = leftSum + arr[i];
        for(int i = n/2;i<n;i++)
            rightSum = rightSum + arr[i];

        return leftSum * rightSum;
    }
}
