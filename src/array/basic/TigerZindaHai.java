package array.basic;

import java.util.HashSet;

//Completed GFG - correct
public class TigerZindaHai
{
    public static void main(String[] args)
    {
        String[] arr = new String[]{"5", "8" ,"9", "6" ,"END", "4" ,"END", "9" ,"2", "END", "7", "9"};
        System.out.println(count_tabs(arr,arr.length));
    }
    public static int count_tabs (String arr[], int n)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<n;i++)
        {
            if(arr[i].equals("END"))
            {
                set.clear();
                continue;
            }
            else
                {
                    int num  = Integer.parseInt(arr[i]);
                if (set.contains(num))
                    set.remove(num);
                else
                    set.add(num);
            }
        }
        return set.size();
    }
}
