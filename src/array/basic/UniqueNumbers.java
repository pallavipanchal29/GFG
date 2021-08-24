package array.basic;

import java.util.ArrayList;
import java.util.HashSet;

//Completed GFG - correct
public class UniqueNumbers
{
    public static void main(String[] args)
    {
        System.out.println(uniqueNumbers(10,20));
    }
    static ArrayList<Integer> uniqueNumbers(int L, int R)
    {
        ArrayList<Integer> answers = new ArrayList<>();
        for(int i = L;i<=R;i++)
        {
            if(isUnique(i))
                answers.add(i);
        }
        return answers;
    }

    private static boolean isUnique(int num)
    {
        HashSet<Integer> set = new HashSet<>();
        int temp = num;
        while (temp != 0)
        {
            int t = temp % 10;
            if(set.contains(t))
                return false;
            else
                set.add(t);
            temp = temp / 10;
        }
        return true;
    }
}
