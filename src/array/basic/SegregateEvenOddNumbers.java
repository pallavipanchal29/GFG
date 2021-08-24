package array.basic;

import java.util.PriorityQueue;

//Completed GFG - correct
public class SegregateEvenOddNumbers
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{0, 1, 2, 3, 4};
        segregateEvenOdd(arr,arr.length);

        for(int i = 0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    static void segregateEvenOdd(int arr[], int n)
    {
        int temp[] = new int[n];
        System.arraycopy(arr,0,temp,0,n);
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i = 0;i<n;i++)
        {
            if(temp[i] % 2 == 0)
                queue.add(temp[i]);
        }
        int index = 0;
        while (!queue.isEmpty())
        {
            arr[index++] = queue.poll();
        }
        for(int i = 0;i<n;i++)
        {
            if(temp[i] % 2 == 1)
                queue.add(temp[i]);
        }
        while (!queue.isEmpty())
        {
            arr[index++] = queue.poll();
        }
    }
}
