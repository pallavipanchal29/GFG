package matrix.basic;

import java.util.HashMap;

public class MaxOnesInRow
{
    public static void main(String[] args)
    {
        int[][] nums = new int[][]{{0,0,0,0},{0,1,1,1},{0,0,1,1}};
        System.out.println(maxOnes(nums,3,4));
    }
    public static int maxOnes (int Mat[][], int N, int M)
    {
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        int row = 0;
        int col = 0;

        boolean found = false;
        while (row < N)
        {
            while (col < M && row < N)
            {
                if(Mat[row][col] == 1) {
                    found = true;
                    break;
                }
                col++;
            }
            if(found)
            {
                int count = M - col;
                if (count > max) {
                    max = count;
                    maxIndex = row;
                }
            }
            row++;
            col = 0;
            found = false;
        }

        return maxIndex;
    }
}
