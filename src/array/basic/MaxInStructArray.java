package array.basic;

public class MaxInStructArray
{
    static class Height {
        int feet;
        int inches;
        public Height(int ft, int inc)
        {
            feet = ft;
            inches = inc;
        }
    }
    public static void main(String[] args)
    {
        Height[] arr = new Height[]
                {
                        new Height(1,2),
                        new Height(2,1)
                };
        System.out.println(findMax(arr,arr.length));
    }
    public static int findMax(Height arr[], int n)
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++)
        {
            int inches = arr[i].feet * 12 + arr[i].inches;
            max = Math.max(max,inches);
        }
        return max;
    }
}
