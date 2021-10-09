package array.basic;

//Completed GFG - correct
public class TypeOfArray
{
    static class pair
    {
        int type;
        long max;

        public pair(int type,long max)
        {
            this.type = type;
            this.max = max;
        }
    }
    public static void main(String[] args)
    {
        long[] arr = new long[]{2 ,3, 6, 9 ,12};
        pair answer = maxNtype(arr,arr.length);

        System.out.println(answer.max+" "+answer.type);
    }
    static pair maxNtype(long arr[], long n)
    {
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        int maxI = 0;
        int minI = 0;

        for(int i = 0;i<n;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
                maxI = i;
            }
            if(arr[i] < min)
            {
                min = arr[i];
                minI = i;
            }
        }

        if(max == arr[(int) (n-1)] && min == arr[0])
            return new pair(1,max); // Ascending
        else if(max == arr[0] && min == arr[(int) (n-1)])
            return new pair(2,max); // Descending
        else if(maxI > minI)
            return new pair(3,max); // Descending rotated
        else if(maxI < minI)
            return new pair(4,max); // Ascending rotated

        return null;
    }
}
