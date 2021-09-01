package matrix.school;

public class MultiplyMatrices
{
    public static void main(String[] args)
    {
        int[][] mat1 = new int[][]{{7, 8}, {2 , 9}};
        int[][] mat2 = new int[][]{{14, 5}, {5, 18}};
        int N = mat1.length;
        int[][] C = new int[N][N];
        multiply(mat1,mat2,C,N);

        for(int i = 0;i<N;i++)
        {
            for(int j = 0;j<N;j++)
            {
                System.out.print(C[i][j]+" ");
            }
        }
    }
    public static void multiply(int A[][], int B[][], int C[][], int N)
    {
        for (int row = 0;row < N;row++)
        {
            for (int col = 0; col < N; col++)
            {
                for(int k = 0;k<N;k++)
                {
                    C[row][col] = A[row][k] * B[k][col];
                }
            }
        }
    }
}
