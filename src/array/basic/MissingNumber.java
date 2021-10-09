package array.basic;

//Completed GFG - correct
public class MissingNumber
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{2, 5, 3, 1};
        System.out.println(missingNumber(arr,5));
    }
    public static int missingNumber(int a[], int n)
    {
       int expectedSum = n * (n+1)/2;
       int actualSum = 0;
       for(int i = 0;i<a.length;i++)
           actualSum = actualSum + a[i];

       return expectedSum - actualSum;
    }
}
