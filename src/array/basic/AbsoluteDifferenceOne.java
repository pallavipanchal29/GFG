package array.basic;

import java.util.ArrayList;

//Completed GFG - correct
public class AbsoluteDifferenceOne
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{87, 89, 45, 235, 465, 765, 123, 987, 499, 655};
        long[] answer = getDigitDiff1AndLessK(arr,arr.length,1000);

        for(int i = 0;i<answer.length;i++)
            System.out.print(answer[i]+" ");
    }
    static long[] getDigitDiff1AndLessK(long[] arr, int n, long k)
    {
        ArrayList<Long> answer = new ArrayList<>();
        for(int i = 0;i<n;i++)
        {
            if(arr[i] < k && String.valueOf(arr[i]).length() > 1)
            {
                if(isDiffOne(arr[i]))
                    answer.add(arr[i]);
            }
        }
        return answer.stream().mapToLong(i->i).toArray();
    }

    private static boolean isDiffOne(long num)
    {
        long temp = num;
        int index = 0;
        long[] digits = new long[String.valueOf(num).length()];
        while (temp != 0)
        {
            long digit = temp % 10;
            digits[index++] = digit;
            temp = temp /10;
        }
        for(int i= 0;i<digits.length-1;i++)
        {
            if(Math.abs(digits[i]-digits[i+1]) != 1)
                return false;
        }
        return true;
    }
}
