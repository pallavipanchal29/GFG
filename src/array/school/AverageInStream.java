package array.school;


//Problem with rounding
public class AverageInStream
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{17, 18, 14, 90, 50 ,30, 44 ,54 ,70, 4, 27};
        float[] answers = streamAvg(arr,arr.length);

        for(int i = 0;i<answers.length;i++)
            System.out.print(answers[i]+" ");
    }
    static float[] streamAvg(int[] arr, int n)
    {
        float[] answers = new float[n];
        float sum = 0.0f;
        for(int i = 0;i<n;i++)
        {
            sum = sum + arr[i];
            answers[i]= (float) ((float)Math.floor((sum / (i+1)) * 100.00) / 100.00);

        }
        return answers;
    }
}
