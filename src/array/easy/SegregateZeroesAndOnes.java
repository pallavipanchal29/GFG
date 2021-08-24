package array.easy;

//Completed GFG - correct
public class SegregateZeroesAndOnes
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{0, 0, 1, 1, 0};
        segregate0and1(arr,arr.length);

        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void segregate0and1(int[] arr, int n)
    {
        int left = 0;
        int right = n-1;

        while (left < right)
        {
            while (arr[left] == 0 && left<right)
                left++;
            while (arr[right] == 1 && left<right)
                right--;

            if(left<right)
            {
                int t = arr[left];
                arr[left] = arr[right];
                arr[right] = t;
                left++;
                right--;
            }
        }
    }
}
