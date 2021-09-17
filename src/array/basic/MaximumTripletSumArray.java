package array.basic;

//Completed GFG - correct
public class MaximumTripletSumArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 0, 8, 6, 4, 2};
        System.out.println(maxTripletSum(arr,arr.length));
    }
    static int maxTripletSum(int a[], int n)
    {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++)
        {
            if(a[i] > max1)
            {
                max3 = max2;
                max2 = max1;
                max1 = a[i];
            }
            else if(a[i] <= max1 && a[i] > max2)
            {
                max3 = max2;
                max2 = a[i];
            }
            else if(a[i] <= max2 && a[i] > max3)
                max3 = a[i];
        }
        return max1 + max2 + max3;
    }
}
