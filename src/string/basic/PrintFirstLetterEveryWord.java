package string.basic;

//Completed GFG - correct
public class PrintFirstLetterEveryWord
{
    public static void main(String[] args)
    {
        System.out.println(firstAlphabet("geeks for geeks"));
    }
    static String firstAlphabet(String S)
    {
        StringBuilder sb = new StringBuilder();
        String[] temp = S.split(" ");
        for(int i = 0;i<temp.length;i++)
            sb.append(temp[i].charAt(0));
        return sb.toString();
    }
}
