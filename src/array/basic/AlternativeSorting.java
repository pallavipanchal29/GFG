package array.basic;

import java.util.ArrayList;
import java.util.Arrays;

//Completed GFG - correct
public class AlternativeSorting
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{7, 1, 2, 3, 4, 5, 6};
        ArrayList<Long> answer = alternateSort(arr,arr.length);

        for(int i = 0;i<arr.length;i++)
            System.out.print(answer.get(i)+" ");
    }
    static ArrayList<Long> alternateSort(long arr[] , int N)
    {
        ArrayList<Long> answer = new ArrayList<>();
        long[] temp = new long[N];
        Arrays.sort(arr);

        for(int k = 0,i=0,j = N-1;k<N;++k)
        {
            if(k%2 == 1)
            {
                temp[k] = arr[i++];
            }
            else
                temp[k] = arr[j--];
        }

        for(int p = 0;p<temp.length;p++)
            answer.add(temp[p]);
        return answer;
    }
}
