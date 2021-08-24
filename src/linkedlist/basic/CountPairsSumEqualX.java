package linkedlist.basic;

import java.util.ArrayList;
import java.util.LinkedList;

public class CountPairsSumEqualX
{
    public static void main(String[] args)
    {
        LinkedList<Integer> head1 = new LinkedList<>();
        head1.add(7);
        head1.add(5);
        head1.add(1);
        head1.add(3);


        LinkedList<Integer> head2 = new LinkedList<>();
        head2.add(3);
        head2.add(5);
        head2.add(2);
        head2.add(8);

        System.out.println(countPairs(head1,head2,10));
    }
    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                                 int x)
    {
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<head1.size();i++)
            list.add(head1.get(i));

        for(int i = 0;i<head2.size();i++)
        {
            int val = x-head2.get(i);
            if(list.contains(val))
                count++;
        }
        return count;
    }
}
