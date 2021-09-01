package string.basic;

//Completed GFG - correct
public class CheckIfStringsRotations
{
    public static void main(String[] args)
    {
        System.out.println(areRotations("geeksforgeeks","forgeeksgeeks"));
    }
    public static boolean areRotations(String s1, String s2 )
    {
       if(s1.length() != s2.length())
           return false;

       return (s1.concat(s1)).contains(s2);
    }
}
