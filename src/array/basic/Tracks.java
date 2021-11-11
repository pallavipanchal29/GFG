package array.basic;

public class Tracks
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{2, 1, 2};
        System.out.println(answer(arr,arr.length));
    }
    public static String answer(long arr[], long n)
    {
        if(n % 2 == 0)
            return "No";
        int mid = (int) (n % 2);
        if(arr[mid] != 1)
            return "No";
        return null;
    }
}
