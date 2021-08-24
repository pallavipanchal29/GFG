package array.basic;

//Completed GFG - correct
public class BinaryArraySorting
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,0,1,1,1,1,1,0,0,0};
        int[] answer = SortBinaryArray(arr,arr.length);

        for(int i = 0;i<answer.length;i++)
            System.out.print(answer[i]+" ");
    }
    static int[] SortBinaryArray(int arr[], int n)
    {
       int i = 0;
       int j = n-1;

       while (i < j)
       {
           if(arr[i] == 0)
               i++;
           else if(arr[i] == 1 && arr[j] == 1)
               j--;
           else if(arr[i] == 1 && arr[j] == 0)
           {
               int t = arr[i];
               arr[i] = arr[j];
               arr[j] = t;
               i++;
               j--;
           }
       }
       return arr;
    }
}
