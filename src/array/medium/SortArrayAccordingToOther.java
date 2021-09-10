package array.medium;

import java.util.*;

//Completed GFG - correct
public class SortArrayAccordingToOther
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{45, 15, 23 ,8, 5, 12, 26, 444 ,888 ,151, 12 ,23 ,45, 15, 56};
        int[] brr = new int[]{15 ,888, 444 ,5, 8 ,12 ,23};

        int[] answer = sortA1ByA2(arr,arr.length,brr,brr.length);

        for(int i = 0;i<answer.length;i++)
            System.out.print(answer[i]+" ");
    }
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M)
    {
        int[] answer = new int[N];
        int index = 0;

        //Create a sorted map for Arr1 elements
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i = 0;i<N;i++)
            map.put(A1[i],map.getOrDefault(A1[i],0)+1);

        //Find arr2 element in map and iterate for number of times arr1 elements exists add it into answer array
        for(int i = 0;i<M;i++)
        {
            if(!map.containsKey(A2[i]))continue;
            int p = map.get(A2[i]);
            for(int j = 0;j<p;j++)
                answer[index++] = A2[i];
            map.remove(A2[i]);
        }
        //Add remaining elements of arr1 in sorted order
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            int count = entry.getValue();
            while (count > 0)
            {
                answer[index++] = entry.getKey();
                count--;
            }
        }

        return answer;
    }
}
