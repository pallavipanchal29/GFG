package array.basic;

import java.util.Arrays;
import java.util.HashSet;

//Completed GFG - correct
public class UnionOfTwoArrays
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1 ,1 ,2, 2, 3, 3};
        int[] brr = new int[]{8, 9 ,7, 6, 5};
        System.out.println(doUnion(arr,arr.length,brr, brr.length));
    }
    public static int doUnion(int a[], int n, int b[], int m)
    {
        Arrays.sort(a);
        Arrays.sort(b);
        HashSet<Integer> set = new HashSet<>();

        int i = 0;
        int j = 0;

        while (i < n && j < m)
        {
            if(a[i] == b[j])
            {
                set.add(a[i]);
                i++;
                j++;
            }
            else if(a[i] < b[j])
            {
                set.add(a[i]);
                i++;
            }
            else
            {
                set.add(b[j]);
                j++;
            }
        }
        while (i<n)
        {
            set.add(a[i]);
            i++;
        }
        while (j < m)
        {
            set.add(b[j]);
            j++;
        }
        return set.size();
    }
}
