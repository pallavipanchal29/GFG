package string.basic;

//Completed GFG - correct
public class CountNumberElementsBetweenTwoArrayElements
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{7 ,5, 15, 1, 11, 12, 16, 5, 12, 10};
        System.out.println(getCount(arr,arr.length,7,7));
    }
    static int getCount(int arr[], int n, int num1, int num2)
    {
        int left = 0;
        int right = n-1;

        while (left < n)
        {
            if(arr[left] == num1)
                break;
            left++;
        }
        while (right >= 0)
        {
            if(arr[right] == num2)
                break;
            right--;
        }
        return (right == left) ?0 : (right - left -1);
    }
}
