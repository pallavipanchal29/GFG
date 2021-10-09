package array.basic;

//Completed GFG - correct
public class ShuffleIntegers
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{1, 2, 3, 4, 5, 6};
        shuffleArray(arr,arr.length);

        for(int i = 0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

    }
    static void shuffleArray(long arr[], int n)
    {
        int mid = n/2;
        int index = 0;
        long[] temp = new long[n];
        System.arraycopy(arr,0,temp,0,n);
        int i = 0;
        int j = mid;

        while (i < mid && j < n)
        {
            arr[index++] = temp[i];
            arr[index++] = temp[j];
            i++;
            j++;
        }
    }
}
