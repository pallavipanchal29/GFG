package array.basic;

//Completed GFG - correct
public class MinimumAndMaximumElementArray
{
    static class pair
    {
        long first, second;
        public pair(long first, long second)
        {
            this.first = first;
            this.second = second;
        }
    }
    static pair getMinMax(long a[], long n)
    {
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++)
        {
            min = Math.min(a[i],min);
            max = Math.max(a[i],max);
        }
        return new pair(min,max);
    }
    public static void main(String[] args)
    {
        long[] arr = new long[]{3, 2, 1, 56, 10000, 167};
        pair answers = getMinMax(arr,arr.length);

        System.out.println(answers.first+" "+answers.second);
    }
}
