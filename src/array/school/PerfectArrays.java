package array.school;

public class PerfectArrays
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(IsPerfect(arr,arr.length));
    }
    public static boolean IsPerfect(int a[], int n)
    {
        int i = 0;
        int j = n-1;

        while (i<j)
        {
            if(a[i] != a[j])
                return false;
            else
            {
                i++;
                j--;
            }
        }
        return true;
    }
}
