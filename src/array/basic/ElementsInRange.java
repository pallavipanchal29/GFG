package array.basic;

//Completed GFG - correct
public class ElementsInRange
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{1, 4, 5, 2, 7, 8, 3};
        System.out.println(check_elements(arr,arr.length,2,6));
    }
    static boolean check_elements(long arr[], int n, int A, int B)
    {
        int totalElements = (B- A + 1);
        if(totalElements > n)
            return false;
        int count = 0;
        int[] rangeElems = new int[B+1];
        for(int i = A;i<=B;i++)
            rangeElems[i] = 1;
        for(int i = 0;i<n;i++)
        {
            if(arr[i]>=A && arr[i]<=B)
            {
                if(rangeElems[(int) arr[i]] == 1)
                {
                    rangeElems[(int)arr[i]]++;
                    count++;
                }
            }
        }
        return count == totalElements;
    }
}
