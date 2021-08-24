package array.basic;

import java.util.Collections;
import java.util.PriorityQueue;

//Completed GFG - correct
public class KLargestElements
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{12, 5, 787, 1, 23};
        int[] answer = kLargest(arr,arr.length,2);

        for(int i = 0;i<answer.length;i++)
            System.out.print(answer[i]+" ");
    }
    static int[] kLargest(int[] arr, int n, int k)
    {
        int[] answer = new int[k];
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0;i<n;i++)
        {
            queue.add(arr[i]);
        }
        for(int i = 0;i<k;i++)
        {
            answer[i] = queue.poll();
        }
        return answer;
    }
}
