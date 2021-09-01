package matrix.basic;

import java.util.ArrayList;

//Completed GFG - correct
public class PrintMatrixSnakePattern
{
    public static void main(String[] args)
    {
        //45 48 54 87 89 21 70 78 15
        int[][] nums = new int[][]{{45, 48, 54},{21, 89, 87},{70, 78, 15}};
        System.out.println(snakePattern(nums));
    }
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = 0;i<matrix.length;i++)
        {
            if(i % 2 == 0)
            {
                for(int j = 0;j<matrix[i].length;j++)
                {
                    answer.add(matrix[i][j]);
                }
            }
            else
            {
                for(int j = matrix[i].length-1;j>= 0;j--)
                {
                    answer.add(matrix[i][j]);
                }
            }
        }
        return answer;
    }
}
