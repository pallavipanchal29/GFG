package array.basic;

import java.util.HashSet;

//Completed GFG - correct
public class ProfessorAndParties
{
    public static void main(String[] args)
    {
        long[] arr = new long[]{1, 2, 3, 4, 7};
        System.out.println(PartyType(arr,arr.length));
    }
    public static String PartyType( long a[], int n)
    {
        HashSet<Long> set = new HashSet<>();
        for(int i = 0;i<n;i++)
        {
            if(set.contains(a[i]))
                return "BOYS";
            else
                set.add(a[i]);
        }
        return "GIRLS";
    }
}
