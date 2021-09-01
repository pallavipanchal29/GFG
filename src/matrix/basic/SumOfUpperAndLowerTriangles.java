package matrix.basic;

import java.util.ArrayList;

//Completed GFG - correct
public class SumOfUpperAndLowerTriangles
{
    public static void main(String[] args)
    {
        int[][] nums = new int[][]{{6, 5, 4},{1, 2, 5},{7, 9, 7}};
        System.out.println(sumTriangles(nums,nums.length));
    }
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        ArrayList<Integer> answers = new ArrayList<>();
        int sum = 0;

        //Upper triangle
        for(int i = 0;i<n;i++)
        {
            for(int j = i;j<matrix[i].length;j++)
            {
                sum = sum + matrix[i][j];
            }
        }
        answers.add(sum);
        sum = 0;

        //Lower Triangle
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<= i;j++)
            {
                sum = sum + matrix[i][j];
            }
        }
        answers.add(sum);
        return answers;
    }
}
