package array.basic;

//Completed GFG - correct
public class StableSortAndPosition
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{3, 4, 3, 5, 2, 3, 4, 3, 1, 5};
        System.out.println(getIndexInSortedArray(arr,arr.length,5));
    }
    static long getIndexInSortedArray(long arr[], int n,int index)
    {
        long ind = 0L;
        long elemAtInitialIndex = arr[index];
        for(int i = 0;i<n;i++)
        {
            if(arr[i] < elemAtInitialIndex)
                ind++;
            else if(arr[i] == elemAtInitialIndex && i < index)
                ind++;
        }
        return ind;
    }
}
