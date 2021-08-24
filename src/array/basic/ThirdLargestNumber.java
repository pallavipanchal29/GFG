package array.basic;

//Completed GFG - correct
public class ThirdLargestNumber
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{10,2};
        System.out.println(thirdLargest(arr,arr.length));
    }
    static int thirdLargest(int a[], int n)
    {
        int first = -1;
        int second = -1;
        int third = -1;

        for(int i = 0;i<n;i++)
        {
            if(a[i] > first)
            {
                third = second;
                second = first;
                first = a[i];
            }
            else if(a[i] < first && a[i] > second)
            {
                third = second;
                second = a[i];
            }
            else if(a[i] < second && a[i] > third)
            {
                third = a[i];
            }
        }
        return third;
    }
}
