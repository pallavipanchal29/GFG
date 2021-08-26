package array.easy;

public class MissingNumberInArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,5};
        System.out.println(MissingNumber(arr,5));
    }
    static int MissingNumber(int nums[], int n)
    {
        int expectedSum = (n * (n + 1))/2;
        int actualSum = 0;

        for(int i = 0;i<nums.length;i++)
            actualSum = actualSum + nums[i];

        return expectedSum - actualSum;
    }
}
