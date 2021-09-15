package array.easy;

public class ThreeWayPartitioning
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2, 3, 3, 4};
        threeWayPartition(arr,1,2);

        for(int i = 0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static void threeWayPartition(int array[], int a, int b)
    {
        int start = 0;
        int end = array.length - 1;
        int temp = 0;

        for(int i = 0;i<array.length - 1;)
        {
            if(array[i] < a)
            {
                temp = array[start];
                array[start] = array[i];
                array[i] = temp;
                start++;
                i++;
            }
            else if(array[i] > b)
            {
                temp = array[end];
                array[end] = array[i];
                array[i] = temp;
                end--;
                i++;
            }
            else
                i++;
        }
    }
}
