package array.school;

//Completed GFG - correct
public class JavaArrays
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{2 ,55 ,85 ,656, 52, 554, 545, 5 ,2};
        System.out.println(average(arr,arr.length));
    }
    static String average(int A[], int N)
    {
        int sum = 0;
        for(int i = 0;i<N;i++)
            sum = sum + A[i];
        float avg = (float) (sum*1.0/N);
        String s=String.format("%.2f",avg);

        return sum + " " + s;
    }
}
