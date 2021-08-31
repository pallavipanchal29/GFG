package matrix.school;

public class SumOfElements
{
    public static void main(String[] args)
    {
        int[][] nums = new int[][]{{1,0,1},{-8,9,-2}};
        System.out.println(sumOfMatrix(2,3,nums));
    }
    static int sumOfMatrix(int N, int M, int[][] Grid)
    {
        int sum = 0;
        for(int i = 0;i<N;i++)
        {
            for(int j = 0;j<M;j++)
            {
                sum = sum + Grid[i][j];
            }
        }
        return sum;
    }
}
