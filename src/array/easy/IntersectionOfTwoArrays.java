package array.easy;

import java.util.HashSet;

//Completed GFG - correct
public class IntersectionOfTwoArrays
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int[] brr = new int[]{3, 4, 5, 6, 7};
        System.out.println(NumberofElementsInIntersection(arr,brr,arr.length, brr.length));
    }
    public static int NumberofElementsInIntersection(int a[],int b[],int n,int m)
    {
        HashSet<Integer> set1 = new HashSet<>();
        for(int i = 0;i<n;i++)
            set1.add(a[i]);
        HashSet<Integer> set2 = new HashSet<>();
        for(int i = 0;i<m;i++)
            set2.add(b[i]);

        set1.retainAll(set2);
        return set1.size();
    }
}
