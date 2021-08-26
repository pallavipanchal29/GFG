package matrix.basic;

public class CountZeroesInSortedMatrix
{
    public static void main(String[] args)
    {
        int[][] nums = new int[][]{{0,0,0},{0,0,1},{0,1,1}};
        System.out.println(countZeros(nums,nums.length));

    }
    static int countZeros(int A[][], int N)
    {
        int count = 0;
        for(int i = 0;i<N;i++)
        {
            for(int j = 0;j<A[i].length;j++)
            {
                if(A[i][j] == 0)
                    count++;
            }
        }
        return count;
    }
}
