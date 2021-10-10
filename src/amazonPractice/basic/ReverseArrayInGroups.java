package amazonPractice.basic;

import java.util.ArrayList;

public class ReverseArrayInGroups
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        reverseInGroups(arr,arr.size(),3);
        for(int i = 0;i<arr.size();i++)
            System.out.print(arr.get(i)+" ");
    }
    static void reverseInGroups(ArrayList<Integer> arr, int n, int k)
    {
        if(k > n)
            return;
        int i = 0;
        int j = Math.min(k,n-k);

    }
}
