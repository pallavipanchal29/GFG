package array.basic;

//Completed GFG - correct
public class LastIndexOfOne
{
    public static void main(String[] args)
    {
        String str = "0";
        System.out.println(lastIndex(str));
    }
    public static int lastIndex( String s)
    {
        for(int i = s.length()-1;i>= 0;i--)
        {
            if(s.charAt(i) == '1')
                return i;
        }
        return -1;
    }
}
