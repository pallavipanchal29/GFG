package array.basic;

//Completed GFG - correct
public class MaximumRepeatingNumber
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{2, 2, 1, 0, 0, 1};
        System.out.println(maxRepeating(arr,arr.length,3));
    }
    static int maxRepeating(int[] arr, int n, int k)
    {
        int maxCount = 0;
        int maxNum = 0;
       int[] count = new int[k];
       for(int i = 0;i<n;i++)
       {
           count[arr[i]]++;
       }
       for(int i = 0;i<count.length;i++)
       {
           if(count[i] > maxCount)
           {
               maxCount = count[i];
               maxNum = i;
           }
       }
       return maxNum;
    }
}
