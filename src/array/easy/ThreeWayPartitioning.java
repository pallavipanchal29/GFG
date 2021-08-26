package array.easy;

public class ThreeWayPartitioning
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,5};
        threeWayPartition(arr,1,2);

        for(int i = 0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static void threeWayPartition(int array[], int a, int b)
    {
        int i = 0;
        int mid = a;
        int j = array.length -1;
        int t= 0;


    }
}
