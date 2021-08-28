package array.easy;

public class FacingTheSun
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{2, 3, 4, 5};
        System.out.println(countBuildings(arr,arr.length));
    }
    static int countBuildings(int h[], int n)
    {
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++)
        {
            if(h[i] > max)
            {
                max = h[i];
                count++;
            }
        }
        return count;
    }
}
