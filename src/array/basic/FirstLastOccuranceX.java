package array.basic;

import java.util.ArrayList;

public class FirstLastOccuranceX
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 3, 3, 4 };
        System.out.println(firstAndLast(arr,arr.length,3));
    }
    public static ArrayList<Integer> firstAndLast(int arr[], int n, int x)
    {
        ArrayList<Integer> answer = new ArrayList<>();
        int first = firstOccurance(arr,0,n-1,x);
        int last = lastOccurance(arr,0,n-1,x);

        answer.add(first);
        answer.add(last);
        return answer;
    }

    private static int lastOccurance(int[] arr, int low, int high, int x)
    {
        if(low > high)
            return -1;

        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if(arr[mid] == x)
            {
                while (arr[mid] == x && mid < arr.length-1)
                    mid++;
                return mid+1;
            }
            else if(arr[mid] > x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    private static int firstOccurance(int[] arr, int low, int high, int x)
    {
        if(low > high)
            return -1;

        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if(arr[mid] == x)
            {
                while (arr[mid] == x && mid >= 0)
                    mid--;
                return mid+1;
            }
            else if(arr[mid] > x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
