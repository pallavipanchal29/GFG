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
        int row = 0;
        int col = N-1;

        //start from last column & check if last column contains 1 then all rows in that column will be 1
        while(row<N & col>=0)
        {
            //if it contains 1 move 1 column to left side
            if ( A [row][col] == 1)
            {
                col--;
            }
            else
            {
                //if it is zero all columns from 0 to that columns will be zero so count is incremented by that amount
                // and moved to second row
                count += col+1;
                row++;
            }
        }
        return count;
    }
}
