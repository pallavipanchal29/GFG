package array.basic;

import java.util.Arrays;

//completed GFG - correct
public class CheckArithmaticProgression
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{12, 40, 11, 20};
        System.out.println(checkIsAP(arr,arr.length));
    }
    static boolean checkIsAP(int arr[] ,int n)
    {
        int diff = 0;
        Arrays.sort(arr);
        for(int i = 1;i<n;i++)
        {
            int d = arr[i] - arr[i - 1];
            if(diff == 0) {
                diff = d;
            }
            else
            {
                if(d != diff)
                    return false;
            }
        }
        return true;
    }
}
