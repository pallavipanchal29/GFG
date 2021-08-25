package array.easy;

import java.util.HashMap;

//Completed GFG - correct
public class SumEqualsToSum
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{3, 4, 7, 1, 2, 9, 8};
        System.out.println(findPairs(arr,arr.length));
    }
    public static int findPairs(int arr[],int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = 0;i<n-1;i++)
        {
            for(int j = i+1;j<n;j++)
            {
                sum = arr[i] + arr[j];
                map.put(sum,map.getOrDefault(sum,0)+1);
                if(map.get(sum) == 2)
                    return 1;
            }
        }
        return 0;
    }
}
