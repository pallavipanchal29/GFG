package array.school;

//Completed GFG - correct
public class PalindromicArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{121,131, 20};
        System.out.println(palinArray(arr,arr.length));
    }
    public static int palinArray(int[] a, int n)
    {
        for(int i = 0;i<n;i++)
        {
            if(!isPalindrome(a[i]))
                return 0;
        }
        return 1;
    }

    private static boolean isPalindrome(int num)
    {
        StringBuilder sb = new StringBuilder();
        int temp = num;
        while (temp != 0)
        {
            int t = temp % 10;
            sb.append(t);
            temp = temp / 10;
        }
        return sb.toString().equals(String.valueOf(num));
    }
}
