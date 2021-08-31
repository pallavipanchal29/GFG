package array.easy;

//Completed GFG - correct
public class TwoRepeatedElements
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,1,3,4,3};
        int[] answers = twoRepeated(arr,arr.length);
        System.out.println(answers[0]+" "+answers[1]);
    }
    public static int[] twoRepeated(int arr[], int N)
    {
        int[] answer = new int[2];
        int index = 0;
        for (int i = 0; i <arr.length ; i++)
        {
            if(arr[Math.abs(arr[i])]<0)
                answer[index++] = Math.abs(arr[i]);
            else
                arr[Math.abs(arr[i])] = arr[Math.abs(arr[i])] * -1;
        }
        return answer;
    }
}
