package array.easy;

//Completed GFG - correct
public class SortArrayOfZeroOneTwo
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{0, 1 ,0};
        sort012(arr,arr.length);

        for(int i = 0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static void sort012(int a[], int n)
    {
        int low = 0;
        int mid = 0;
        int high = n-1;
        int temp = 0;

        while (mid <= high)
        {
            switch (a[mid])
            {
                case 0:
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                    high--;
                    break;
            }
        }
    }
}
