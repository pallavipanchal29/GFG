package amazonPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RotateArray
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());

        while (tests-- >0)
        {
            String[] temp = br.readLine().split(" ");
            int n = Integer.parseInt(temp[0]);
            int[] arr = new int[n];
            int d = Integer.parseInt(temp[1]);
            String[] input = br.readLine().split(" ");
            for(int i = 0;i<n;i++)
                arr[i] = Integer.parseInt(input[i]);

            reverse(arr,0,d-1);
            reverse(arr,d,n-1);
            reverse(arr,0,n-1);

            for(int i = 0;i<n;i++)
                System.out.print(arr[i]+" ");

        }
    }

    private static void reverse(int[] arr,int low, int high)
    {
        while (low < high)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
