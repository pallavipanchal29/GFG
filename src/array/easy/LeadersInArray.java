package array.easy;

import java.util.ArrayList;
import java.util.Collections;

//Completed GFG - correct
public class LeadersInArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,0};
        System.out.println(leaders(arr,arr.length));
    }

    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n)
    {
        ArrayList<Integer> answers = new ArrayList<>();
        int max = arr[n-1];
        answers.add(max);
        for(int i = n-2;i>=0;i--)
        {
            if(arr[i] >= max) {
                answers.add(arr[i]);
                max  = arr[i];
            }

        }
        Collections.reverse(answers);
        return answers;
    }
}
