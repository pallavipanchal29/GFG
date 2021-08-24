package array.easy;

public class SortArrayOf012
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{0, 2, 1, 2, 0};
        sort012(arr,arr.length);

        for(int i = 0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static void sort012(int a[], int n)
    {
        int low = 0;
        int mid = 0;
        int high = n-1;

        while (mid <= high)
        {
            switch (a[mid])
            {
                case 0:
                    int t = a[low];
                    a[low] = a[mid];
                    a[mid] = t;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2 :
                    t = a[mid];
                    a[mid] = a[high];
                    a[high] = t;
                    high--;
                    break;
            }
        }
    }
}
