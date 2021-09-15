package array.basic;

import java.util.ArrayList;

//Completed GFG - correct
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
        int[] array = arr.stream().mapToInt(i->i).toArray();
        for (int i = 0; i < n; i += k)
        {
            int left = i;

            int right = Math.min(i + k - 1, n - 1);
            int temp;

            while (left < right)
            {
                temp=array[left];
                array[left]=array[right];
                array[right]=temp;
                left+=1;
                right-=1;
            }
        }
        for(int j = 0;j<n;j++)
        {
            arr.add(array[j]);
        }
    }
}
