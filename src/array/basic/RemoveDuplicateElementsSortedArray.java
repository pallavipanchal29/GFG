package array.basic;

public class RemoveDuplicateElementsSortedArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2, 2};
        int n = remove_duplicate(arr,arr.length);

        for(int i = 0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    static int remove_duplicate(int A[],int N)
    {
        int fin = 0;
        for(int i = 1;i<N;i++)
        {
            if(A[i] != A[fin])
            {
                A[++fin] = A[i];
            }
        }
        return fin+1;
    }
}
