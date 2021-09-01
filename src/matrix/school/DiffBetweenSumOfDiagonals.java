package matrix.school;

public class DiffBetweenSumOfDiagonals
{
    public static void main(String[] args)
    {
        int[][] mat = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSumDifference(2,mat));
    }
    static int diagonalSumDifference(int N, int[][] Grid)
    {
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0;i<N;i++)
        {
            for(int j = 0;j<N;j++)
            {
                if(i == j)
                    sum1 = sum1 + Grid[i][j];
                if(i == N-j-1)
                    sum2 = sum2 + Grid[i][j];
            }
        }
        return Math.abs(sum1-sum2);
    }
}
