package array.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class TripletFamily
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2, 3,4,5};
        System.out.println(findTriplet(arr,arr.length));
    }
    public static ArrayList<Integer> findTriplet(int arr[], int n)
    {
        ArrayList<Integer> answer = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++)
            set.add(arr[i]);
        for(int i = 0;i<n-1;i++)
        {
            int j = i+1;
            int val = arr[i]+arr[j];
            if(set.contains(val))
            {
                answer.add(arr[i]);
                answer.add(arr[j]);
            }
        }
        return answer;
    }
}
