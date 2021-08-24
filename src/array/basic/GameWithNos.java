package array.basic;

//Completed GFG - correct
public class GameWithNos
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{10, 11, 1, 2, 3};
        int[] answers = game_with_number(arr,arr.length);

        for(int i = 0;i<answers.length;i++)
            System.out.print(answers[i]+" ");
    }

    public static int[] game_with_number (int arr[], int n)
    {
        int[] answers = new int[n];
        for(int i = 0;i<n-1;i++)
        {
            answers[i] = arr[i]  ^ arr[i+1];
        }
        answers[n-1] = arr[n-1];
        return answers;
    }
}
