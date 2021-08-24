package array.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Completed GFG - correct
public class RotateArray
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());
        while (tests-- > 0) {
            String[] temp = br.readLine().split(" ");
            int n = Integer.parseInt(temp[0]);
            int d = Integer.parseInt(temp[1]);
            String[] line = br.readLine().split(" ");
            int arr[] = new int[line.length];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(line[i]);
            }

            leftRotate(arr,arr.length,d);

            for(int i = 0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }

    static void leftRotate(int[] arr, int n, int d)
    {
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }

    private static void reverse(int[] arr, int left,int right)
    {
        while (left <= right)
        {
            int t = arr[left];
            arr[left] = arr[right];
            arr[right] = t;
            left++;
            right--;
        }
    }
}
