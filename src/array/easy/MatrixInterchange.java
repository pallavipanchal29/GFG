package array.easy;

//Completed GFG - correct
public class MatrixInterchange
{
    public static void main(String[] args)
    {
        int[][] arr = new int[][] {{1,2,3,4},{4,3,2,1},{6,7,8,9}};
        interchange(arr,arr.length,arr[0].length);
    }
    static void interchange(int a[][],int r, int c)
    {
        int start = 0;
        int end = c-1;
        int p = start;

        for(int i = 0;i<r;i++)
        {
            int t = a[i][p];
            a[i][p] = a[i][end];
            a[i][end] = t;
        }

        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
