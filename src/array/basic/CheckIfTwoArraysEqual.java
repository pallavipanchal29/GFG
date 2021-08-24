package array.basic;

import java.util.HashMap;

//Completed GFG - correct
public class CheckIfTwoArraysEqual
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{20,6, 17,15,19};
        long[] brr = new long[]{6, 17, 20, 19 ,19};

        System.out.println(check(arr,brr,arr.length));
    }
    public static boolean check(long A[],long B[],int N)
    {
        HashMap<Long,Integer> map = new HashMap<>();
        for(int i = 0;i<N;i++)
            map.put(A[i],map.getOrDefault(A[i],0)+1);
        for(int i = 0;i<N;i++)
        {
            if(map.containsKey(B[i]))
            {
                if(map.get(B[i]) > 1)
                    map.put(B[i],map.get(B[i])-1);
                else
                    map.remove(B[i]);
            }
            else
                return false;
        }
        return map.size() == 0;
    }
}
