package array.easy;

public class FrequenciesLimitedRangeArrayElem
{
    public static void main(String[] args)
    {
        //2,2,3,3,5
        int[] arr = new int[]{2,4,5,6,8};
        frequencyCount(arr,arr.length,10);

        for(int i = 0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

    }
//    public static void frequencyCount(int arr[], int N, int P)
//    {
//        int i = 0;
//        while (i < N)
//        {
//            if (arr[i] <= 0)
//            {
//                i++;
//                continue;
//            }
//
//            int elementIndex = arr[i] - 1;
//            if (arr[elementIndex] > 0)
//            {
//                arr[i] = arr[elementIndex];
//                arr[elementIndex] = -1;
//            }
//            else
//            {
//                arr[elementIndex]--;
//                arr[i] = 0;
//                i++;
//            }
//        }
//        for(int j = 0;j<N;j++)
//        {
//            arr[j] = Math.abs(arr[j]);
//        }
//    }

    //Completed GFG - correct
    public static void frequencyCount(int arr[], int N, int P)
    {
            int[] count = new int[N];
            for (int i = 0; i < N; i++)
            {
                if ((arr[i] - 1) < N)
                    count[arr[i] - 1]++;
            }
            for (int i = 0; i < N; i++)
            {
                arr[i] = count[i];
            }
            for (int i = P; i < N; i++)
                arr[i] = 0;
    }
}
