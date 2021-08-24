package array.school;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Completed GFG - correct
public class MaxAndMinOfArrayElements
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

            int max = Integer.MIN_VALUE;
            int min  = Integer.MAX_VALUE;

            for(int i = 0;i<n;i++)
            {
                max = Math.max(max,arr[i]);
                min = Math.min(min,arr[i]);
            }

            System.out.println(max+" "+min);
        }
    }
}
