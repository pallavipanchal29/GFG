package array.easy;

//Completed GFG - correct
public class WaveArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,5};
        convertToWave(arr,arr.length);

        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void convertToWave(int arr[], int n)
    {
        boolean lesser = false;
        boolean greater = true;

        for(int i = 0;i<n-1;i++)
        {
            if(lesser)
            {
                if (arr[i] > arr[i + 1])
                {
                    int t = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = t;
                }
                lesser = false;
                greater = true;
            }
            else if(greater)
            {
                if (arr[i] < arr[i + 1])
                {
                    int t = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = t;
                }
                lesser = true;
                greater = false;
            }
        }
    }
}
