package array.easy;

//Completed GFG - correct
public class FormNumberDivisibleBy3
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 4};
        System.out.println(isPossible(2,arr));
    }
    static int isPossible(int N, int arr[])
    {
        int sum = 0;
        for(int i = 0;i<N;i++)
            sum = sum + findSum(arr[i]);

        return sum % 3 == 0 ? 1 : 0;
    }

    private static int findSum(int num)
    {
        int temp = num;
        int sum = 0;
        while (temp != 0)
        {
            int t = temp % 10;
            sum = sum + t;
            temp = temp / 10;
        }
        return sum;
    }
}
