package array.basic;

import java.util.Arrays;

//Completed GFG - correct
public class RearrangeArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{3, 3, 11, 15, 20, 11, 6, 5, 15,1, 19};
        rearrangeArray(arr,arr.length);

        for(int i = 0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    static void rearrangeArray(int[] arr, int n)
    {
        int[] temp  = new int[n];
        System.arraycopy(arr,0,temp,0,n);
        Arrays.sort(temp);
        int index = 0;

        int i = 0;
        int j = n-1;

        while (i <= j )
        {
            if(index < n)
            {
                arr[index++] = temp[i];
                i++;
            }
            if(index < n) {
                arr[index++] = temp[j];
                j--;
            }
        }
    }
}
