package array.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class KSmallestElementsOriginalOrder
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 28 ,16, 20, 19, 27, 16, 14, 22, 1, 29 ,4, 1, 20, 7, 2, 26};
        System.out.println(kSmallestElements(arr,arr.length,8));
    }
    static ArrayList<Integer> kSmallestElements(int arr[], int n, int k)
    {
        ArrayList<Integer> answers = new ArrayList<>();
        int[] temp = new int[n];
        System.arraycopy(arr,0,temp,0,n);
        Arrays.sort(temp);

        for(int i = 0;i<n;i++)
        {
            if(Arrays.binarySearch(temp,0,k,arr[i]) > -1)
                answers.add(arr[i]);
        }
        return new ArrayList<Integer>(answers.subList(0, k));
    }
}
