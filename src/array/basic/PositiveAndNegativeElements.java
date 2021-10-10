package array.basic;

import java.util.ArrayList;

//Completed GFG - correct
public class PositiveAndNegativeElements
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{-1, 2, -3, 4, -5, 6};
        System.out.println(arranged(arr,arr.length));
    }
    static ArrayList<Long> arranged(long a[], int n)
    {
        ArrayList<Long> positives = new ArrayList<>();
        ArrayList<Long> negatives = new ArrayList<>();
        int p = 0;
        int q = 0;
        for(int i = 0;i<n;i++)
        {
            if(a[i] < 0)
                negatives.add(a[i]);
            else if(a[i] > 0)
                positives.add(a[i]);
        }
        ArrayList<Long> answer = new ArrayList<>();
        boolean flag = true;

        for(int i = 0;i<n;i++)
        {
            if(flag)
            {
                answer.add(positives.get(p));
                p++;
            }
            else
            {
                answer.add(negatives.get(q));
                q++;
            }
            flag = !flag;
        }
        return answer;
    }
}
