package array.basic;

//Completed GFG - correct
public class CountPairSum
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2, 3, 4};
        int[] brr = new int[]{5, 6, 7, 8};
        System.out.println(countPairs(arr,brr,arr.length,brr.length,5));
    }
    static int countPairs(int arr1[],int arr2[], int M, int N, int x)
    {
        int i = 0;
        int j = N-1;
        int count = 0;

        while (i < M && j >= 0)
        {
            if(arr1[i]+arr2[j] == x)
            {
                count++;
                i++;
                j--;
            }
            else if(arr1[i]+arr2[j] < x)
                i++;
            else
                j--;
        }
        return count;
    }
}
