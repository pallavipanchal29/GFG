package array.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TopKFreqElements
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int[] arr = new int[line.length];
        for(int i = 0;i< line.length;i++)
        {
            arr[i] = Integer.parseInt(line[i]);
        }
        int[] answer = topK(arr,3);

        for(int i = 0;i<answer.length;i++)
            System.out.print(answer[i]+" ");
    }
    public static int[] topK(int[] nums, int k)
    {
        int[] answer = new int[k];
        int index = 0;
        for(int i = 0;i<k;i++)
            answer[i] = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> {
            int val1 = o1.getValue();
            int val2 = o2.getValue();
            if(val1 == val2)
                return o2.getKey().compareTo(o1.getKey());
            else
                return o2.getValue().compareTo(o1.getValue());
        });

        for(int i = 0;i<list.size();i++)
        {
            if(k == 0) return answer;
            var pair = list.get(i);
            answer[index++] = pair.getKey();
            k--;
        }
        return answer;
    }
}
