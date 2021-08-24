package array.easy;

import java.util.ArrayList;

//Completed GFG - correct
public class SubarrayWithGivenSum
{
    public static void main(String[] args)
    {
//        int[] arr = new int[]{135 ,101, 170, 125, 79, 159, 163 ,65, 106, 146 ,82, 28 ,162 ,92, 196, 143, 28 ,37, 192, 5,103, 154 ,93, 183 ,22 ,
//                117, 119 ,96 ,48, 127, 172, 139, 70, 113, 68, 100 ,36, 95, 104, 12, 123, 134};
//        int[] arr = new int[]{142 ,112, 54, 69, 148, 45, 63, 158, 38, 60, 124, 142, 130 ,179, 117, 36, 191 ,43, 89, 107, 41, 143, 65, 49, 47, 6, 91, 130, 171 ,
//                151, 7 ,102, 194, 149, 30 ,24 ,85, 155, 157, 41, 167, 177, 132 ,109, 145, 40 ,27, 124, 138,139, 119, 83, 130, 142 ,34,116, 40, 59 ,105, 131, 178,107, 74, 187, 22 ,146 ,125 ,73, 71, 30, 178, 174, 98, 1131};
       int[] arr = new int[]{
               28, 68 ,142, 130, 41, 14 ,175 ,2 ,78, 16, 84, 14, 193, 25 ,2, 193, 160, 71 ,29, 28, 85, 76 ,187, 99, 171, 88 ,48,
               5, 104 ,22, 64, 107, 164, 11, 172, 90 ,41 ,165, 143, 20 ,114, 192 ,105, 19, 33, 151, 6, 176 ,140, 104, 23, 99, 48 ,185, 49, 172, 65
       };
        System.out.println(subarraySum(arr,arr.length,1562));
    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> answers = new ArrayList<>();
        int curr_sum = arr[0], start = 0, i;

        for (i = 1; i <= n; i++) {
            while (curr_sum > s && start < i - 1) {
                curr_sum = curr_sum - arr[start];
                start++;
            }

            if (curr_sum == s) {
                answers.add(start+1);
                answers.add(i);
                return answers;
            }

            if (i < n)
                curr_sum = curr_sum + arr[i];
        }
        answers.add(-1);
        return answers;
    }
}
