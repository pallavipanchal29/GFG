package array.easy;

import java.util.ArrayList;

//Completed GFG - correct
public class CommonElements
{
    public static void main(String[] args)
    {
        int[] A = new int[]{1, 5, 10, 20, 40, 80};
        int[] B = new int[]{6, 7, 20, 80, 100};
        int[] C = new int[]{3, 4, 15, 20, 30, 70, 80, 120};

        System.out.println(commonElements(A,B,C,A.length,B.length,C.length));

    }
    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        ArrayList<Integer> answer = new ArrayList<>();

        int i = 0, j = 0, k = 0;

        int prev1, prev2, prev3;
        prev1 = prev2 = prev3 = Integer.MIN_VALUE;

        while (i < n1 && j < n2 && k < n3) {

            while (i < n1 && A[i] == prev1)
                i++;

            while (j < n2 && B[j] == prev2)
                j++;

            while (k < n3 && C[k] == prev3)
                k++;

            if (i < n1 && j < n2 && k < n3)
            {

                if (A[i] == B[j] && B[j] == C[k])
                {
                    answer.add(A[i]);
                    prev1 = A[i];
                    prev2 = B[j];
                    prev3 = C[k];
                    i++;
                    j++;
                    k++;
                }

                else if (A[i] < B[j]) {
                    prev1 = A[i];
                    i++;
                }

                else if (B[j] < C[k]) {
                    prev2 = B[j];
                    j++;
                }

                else {
                    prev3 = C[k];
                    k++;
                }
            }
        }
        return answer;
    }
}
