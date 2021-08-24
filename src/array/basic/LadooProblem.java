package array.basic;

import java.util.HashSet;

//Completed GFG - correct
public class LadooProblem
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{3, 3, 1, 2, 4};
        System.out.println(divideLadoo(arr.length,arr));
    }
    static int divideLadoo(int N , int[] A)
    {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<N;i++)
        {
            if(!set.contains(A[i]))
            {
                set.add(A[i]);
                count++;
            }
        }
        return count;
    }
}
