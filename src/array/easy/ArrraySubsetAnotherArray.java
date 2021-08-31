package array.easy;

import java.util.HashSet;

//Completed GFG - correct
public class ArrraySubsetAnotherArray
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{11, 1, 13, 21, 3, 7};
        long[] brr = new long[]{11, 3, 7, 1};
        System.out.println(isSubset(arr,brr,arr.length, brr.length));
    }
    public static String isSubset( long a1[], long a2[], long n, long m)
    {
        HashSet<Long> set = new HashSet<>();
        for(int i = 0;i<n;i++)
            set.add(a1[i]);

        for(int i = 0;i<m;i++)
        {
            if(!set.contains(a2[i]))
                return "No";
        }
        return "Yes";
    }
}
