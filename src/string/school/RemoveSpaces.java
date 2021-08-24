package string.school;

public class RemoveSpaces
{
    public static void main(String[] args)
    {
        System.out.println(modify("geeks  for geeks"));
    }
    static String modify(String S)
    {
        S = S.replaceAll("\\s", "");
        return S;
    }
}
