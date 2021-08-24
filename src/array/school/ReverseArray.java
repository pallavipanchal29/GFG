package array.school;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Completed GFG - correct
public class ReverseArray
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());
        while (tests-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            int arr[] = new int[line.length];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(line[i]);
            }

            int i = 0;
            int j = n-1;

            while (i < j)
            {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            }

            for (int p = 0; p < arr.length; p++)
                System.out.print(arr[p] + " ");
            System.out.println();
        }
    }
}
