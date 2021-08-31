package matrix.school;

//Complete GFG - correct
public class IdenticalMatrices
{
    public static void main(String[] args)
    {
        int[][] mat1 = new int[][]{{1,2},{3,4}};
        int[][] mat2 = new int[][]{{1,2},{3,4}};
        System.out.println(areMatricesIdentical(2,mat1,mat2));
    }
    static int areMatricesIdentical(int N, int[][] Grid1, int[][] Grid2)
    {
        for (int row = 0;row < N;row++)
        {
            for(int col = 0;col < N;col++)
            {
                if(Grid1[row][col] != Grid2[row][col])
                    return 0;
            }
        }
        return 1;
    }
}
