package array.basic;

//Completed GFG - correct
public class PartitionPointInArray
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{4, 3, 2, 5, 8, 6, 7};
        System.out.println(FindElement(arr,arr.length));
    }
    static long FindElement(long arr[], int N)
    {
        long res = -1;
        for(int i=0;i<N;i++)
        {
            int j = 0, k = i + 1;

            while (j < i && arr[j] < arr[i])
            {
                j++;
            }

            while (k < N && arr[k] > arr[i])
            {
                k++;
            }

            if (j == i && k == N)
            {
                res = arr[i];
                break;
            }
        }
        return res;
    }
}
