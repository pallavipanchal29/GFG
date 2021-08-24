package array.basic;

import java.util.ArrayList;
import java.util.TreeMap;

//Completed GFG - correct
public class DistinctElementsStream
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{-20, -13, 4, -16, -4 ,-18, -1, 19, 6, -3, -15, 19, -15, 18, 2, -15, -15, -5, -16, 4};
        ArrayList<Integer> answers = Solution(arr,arr.length);

        for(int i = 0;i<answers.size();i++)
            System.out.print(answers.get(i)+" ");

    }
    static ArrayList<Integer> Solution(int arr[], int n)
    {
        ArrayList<Integer> answer = new ArrayList<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int unique = 0;

        for(int i = 0;i<n;i++)
        {
            if(arr[i] >= 0)
            {
                int count = 0;
                if(map.containsKey(arr[i]))
                    count = map.get(arr[i])+1;
                else {
                    count = count + 1;
                    unique++;
                }
                map.put(arr[i], count);
            }
            else
            {
                int count = 0;
                int t = arr[i] * -1;
                if(map.containsKey(t))
                {
                    count = map.get(t) - 1;
                    map.put(t, count);

                    if (count == 0) {
                        unique--;
                        map.remove(t);
                    }
                }
            }
            answer.add(unique);
        }
        return answer;
    }
}
