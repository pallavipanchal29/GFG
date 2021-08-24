package string.school;

//Completed GFG - correct
public class CheckString
{
    public static void main(String[] args)
    {
        System.out.println(check("geeks") == false ? "NO" : "YES");
    }
    static Boolean check (String s)
    {
        char[] temp = s.toCharArray();
        for(int i = 1;i<temp.length;i++)
        {
            if(temp[i] != temp[0])
                return false;
        }
        return true;
    }
}
