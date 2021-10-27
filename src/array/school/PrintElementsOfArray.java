package array.school;

//Completed GFG - correct
public class PrintElementsOfArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2, 3, 4};
        printArray(arr,arr.length);
    }
    //Just print the space seperated array elements
    static void printArray(int arr[], int n)
    {
        for(int i = 0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
