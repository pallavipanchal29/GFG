package array.school;

import java.util.ArrayList;

//Completed GFG - correct
public class ValueEqualIndexValue
{
    public static void main(String[] args)
    {
        int[] arr= new int[]{15, 2, 45, 12, 7};
        ArrayList<Integer> answer = valueEqualToIndex(arr,arr.length);

        for(int i = 0;i<answer.size();i++)
            System.out.print(answer.get(i));
    }
    static ArrayList<Integer> valueEqualToIndex(int arr[], int n)
    {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0;i<n;i++)
        {
            if(arr[i] == i+1)
                answer.add(arr[i]);
        }
        return answer;
    }
}
