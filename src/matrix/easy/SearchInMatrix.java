package matrix.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Completed GFG - correct
public class SearchInMatrix
{
//    public static void main(String[] args)
//    {
//        int[][] nums = new int[][]{{18, 21, 27, 38, 55, 67}};
//        System.out.println(matSearch(nums,1,6,55));
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[][] mat = new int[N][M];

        for(int i = 0;i<N;i++)
        {
            String[] temp = br.readLine().split(" ");
            for(int j = 0;j < M;j++)
            {
                mat[i][j] = Integer.parseInt(temp[j]);
            }
        }
        System.out.println(matSearch(mat,6,6,62));
    }
    public static int matSearch(int mat[][], int N, int M, int X)
    {
        int i = 0, j = M - 1;

        while (i < N && j >= 0)
        {
            if (mat[i][j] == X)
            {
               return 1;
            }
            if (mat[i][j] > X)
                j--;
            else // if mat[i][j] < x
                i++;
        }

        return 0; // if ( i==n || j== -1 )
    }
}
