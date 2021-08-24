package string.basic;

//Completed GFG - correct
public class RemoveCharacter
{
    public static void main(String[] args)
    {
        System.out.println(removeChars("occurrence","car"));
    }
    static String removeChars(String string1, String string2)
    {
        StringBuilder sb = new StringBuilder();
        char[] temp = string1.toCharArray();
        for(int i = 0;i<temp.length;i++)
        {
            if(!string2.contains(String.valueOf(temp[i])))
                sb.append(temp[i]);
        }
        return sb.toString();
    }
}
