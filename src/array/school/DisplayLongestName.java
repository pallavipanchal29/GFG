package array.school;

//Completed GFG - correct
public class DisplayLongestName
{
    public static void main(String[] args)
    {
        String[] arr = new String[]{"Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks"};
        System.out.println(longest(arr, arr.length));
    }
    static String longest(String names[], int n)
    {
        int len = Integer.MIN_VALUE;
        String longest = "";
        for(int i = 0;i<names.length;i++)
        {
            if(names[i].length() > len)
            {
                longest = names[i];
                len = Math.max(len, names[i].length());
            }
        }
        return longest;
    }
}
