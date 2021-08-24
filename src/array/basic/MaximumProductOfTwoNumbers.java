package array.basic;

//completed GFG - correct
public class MaximumProductOfTwoNumbers
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 100, 42, 4, 23};
        System.out.println(maxProduct(arr,arr.length));
    }
    static int maxProduct(int arr[], int n)
    {
        int first = -1;
        int second = -1;
        int maxIndex = 0;

        for(int i = 0;i<n;i++)
        {
            if(arr[i] > first)
            {
                second = first;
                first = arr[i];
                maxIndex = i;
            }
            else if(i != maxIndex && arr[i]< first && arr[i] > second)
            {
                second = arr[i];
            }
        }
        return first * second;
    }
}
