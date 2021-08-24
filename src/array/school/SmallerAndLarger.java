package array.school;

//Completed GFG - correct
public class SmallerAndLarger
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2, 8, 10, 11, 12, 19};
        int[] answers = getMoreAndLess(arr, arr.length,5);

        System.out.println(answers[0]+" "+answers[1]);

    }
    static int[] getMoreAndLess(int[] arr, int n, int x)
    {
        int smaller = 0;
        int greater = 0;

        for(int i = 0;i<n;i++)
        {
            if(arr[i] <= x)
                smaller++;
            if(arr[i] >= x)
                greater++;
        }
        return new int[]{smaller,greater};
    }
}
