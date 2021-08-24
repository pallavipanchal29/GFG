package string.easy;

import java.util.HashMap;
import java.util.Map;

//Completed GFG - correct
public class TwiceCounter
{
    public static void main(String[] args)
    {
        String[] list = new String[]{"Geeks", "For", "Geeks"};
        System.out.println(countWords(list,list.length));
    }
    public static int countWords(String list[], int n)
    {
        int count = 0;
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++)
        {
            map.put(list[i],map.getOrDefault(list[i],0)+1);
        }
        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            if(entry.getValue() == 2)
                count++;
        }
        return count;
    }
}
