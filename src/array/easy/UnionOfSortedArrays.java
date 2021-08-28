package array.easy;

import java.util.ArrayList;
import java.util.TreeSet;

//Completed GFG - correct
public class UnionOfSortedArrays
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] brr = new int[]{1, 2, 3};
        System.out.println(findUnion(arr,brr,arr.length, brr.length));
    }
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        TreeSet<Integer> set=new TreeSet<>();
        for(int x:arr1)
            set.add(x);
        for(int x:arr2)
            set.add(x);
        return new ArrayList<>(set);
    }
}
