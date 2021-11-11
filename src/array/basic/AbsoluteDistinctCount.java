package array.basic;

//Completed GFG - correct
public class AbsoluteDistinctCount
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{-3, -2, 0, 3, 4, 5};
        System.out.println(distinctCount(arr,arr.length));
    }
//    static int distinctCount(int[] arr, int n)
//    {
//        for(int i = 0;i<n;i++)
//        {
//            if(arr[i] < 0)
//                arr[i] = arr[i] * -1;
//        }
//        HashSet<Integer> set = new HashSet<>();
//        for(int i = 0;i<n;i++)
//            set.add(arr[i]);
//
//        return set.size();
//    }

    //Right way as asked in question
    static int distinctCount(int[] arr, int n)
    {
        int count = n;

        int i = 0;
        int j = n-1;
        int sum = 0;

        while (i<j)
        {
            if(i!= j && arr[i] == arr[i+1])
            {
                count--;
                i++;
            }
            if(i!= j && arr[j] == arr[j-1])
            {
                count--;
                j--;
            }
            sum = arr[i] + arr[j];
            if(sum == 0)
            {
                count--;
                i++;
                j--;
            }
            else if(sum <0)
                i++;
            else
                j--;
        }
        return count;
    }
}
