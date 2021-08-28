package array.easy;

import java.util.ArrayList;
import java.util.TreeSet;

public class SortedSubsequenceSize3
{
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(1);
        nums.add(3);
//        nums.add(1);
//        nums.add(3);

        System.out.println(find3Numbers(nums,nums.size()));
    }
    static ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n)
    {
       TreeSet<Integer> set = new TreeSet<>();

       for(int i : arr)
       {
           if(set.size() < 3)
            set.add(i);
       }

       return new ArrayList<>(set);
    }
}
