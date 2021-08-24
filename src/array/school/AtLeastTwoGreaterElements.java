//Completed GFG - correct

//Problem Statement :
//Given an array of N distinct elements,the task is to find all elements
// in array except two greatest elements in sorted order.

package array.school;

import java.util.Arrays;

public class AtLeastTwoGreaterElements
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{7, -2, 3, 4, 9, -1};
        long[] answer = findElements(arr,arr.length);

        for(int i = 0;i<answer.length;i++)
        {
            System.out.print(answer[i]+" ");
        }
    }
    public static long[] findElements( long a[], long n)
    {
        long[] answer = new long[(int) (n-2)];
        Arrays.sort(a);

        for(int i = 0;i<n-2;i++)
            answer[i] = a[i];

        return answer;
    }
}
