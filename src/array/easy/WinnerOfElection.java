package array.easy;

import java.util.*;

//Completed GFG - correct
public class WinnerOfElection
{
    public static void main(String[] args)
    {
        //String[] votes = new String[]{"john","johnny","jackie","johnny","john","jackie","jamie","jamie","john","johnny","jamie","johnny","john"};
        String[] votes = new String[]{"andy","blake","clark"};
        String[] answer = winner(votes,votes.length);
        System.out.println(answer[0]+" "+answer[1]);
    }
    public static String[] winner(String arr[], int n)
    {
        int max = Integer.MIN_VALUE;
        String win = " ";
        String[] answer = new String[2];
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            if(entry.getValue() > max)
            {
                max = entry.getValue();
                win = entry.getKey();
            }
            else if(entry.getValue() == max)
            {
                if(win.compareTo(entry.getKey()) > 0)
                    win = entry.getKey();
            }
        }

        answer[0] = win;
        answer[1] = String.valueOf(max);
        return answer;
    }
}
