package array.medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//Completed GFG - correct
public class SortinElementsOfArrayByFrequency
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());
        while (tests-- > 0)
        {
            //9 9 9 2 5
            //9 9 9 2 5
            int n = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] arr = new int[input.length];

            for(int i = 0;i<arr.length;i++)
                arr[i] = Integer.parseInt(input[i]);

            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i = 0;i< arr.length;i++)
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);

            List<Map.Entry<Integer,Integer>> list = new LinkedList<>(map.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2)
                {
                    if(o1.getValue() == o2.getValue())
                        return o1.getKey().compareTo(o2.getKey());
                    else
                        return o2.getValue().compareTo(o1.getValue());
                }
            });
            int index  = 0;

            for(var entry : list)
            {
                int count = entry.getValue();
                while (count > 0)
                {
                    arr[index++] = entry.getKey();
                    count--;
                }
            }

            for(int i = 0;i<n;i++)
                System.out.print(arr[i]+" ");
            System.out.println();
        }
    }
}
