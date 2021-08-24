package array.school;

//Completed GFG - correct
public class FindIndex
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{6, 5, 4, 3, 1, 2};
        int[] answers = findIndex(arr,arr.length,4);

        System.out.println(answers[0]+" "+answers[1]);
    }
    static int[] findIndex(int a[], int N, int key)
    {
        int[] answers = new int[2];
        int left = 0;
        int right = N-1;

        while (left <N)
        {
            if(a[left] == key)
            {
                answers[0] = left;
                break;
            }
            else
                left++;
        }

        while (right>=0)
        {
            if(a[right] == key)
            {
                answers[1] = right;
                break;
            }
            else
                right--;
        }
        return answers;
    }
}
