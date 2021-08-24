package array.basic;

public class MinimumDistanceTwoElements
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,2};
        System.out.println(minDist(arr,arr.length,1,2));
    }
    static int minDist(int a[], int n, int x, int y)
    {
        int minDist = Integer.MAX_VALUE;
       int p = -1;

        for(int i = 0;i<n;i++)
        {
            if(a[i] == x || a[i] == y)
            {
                if(p != -1 && a[i] != a[p])
                    minDist = Math.min(minDist,i-p);
                p = i;
            }
        }
        return minDist;
    }
}
