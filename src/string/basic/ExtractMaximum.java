package string.basic;

//Completed GFG - correct
public class ExtractMaximum
{
    public static void main(String[] args)
    {
        System.out.println(extractMaximum("100klh564abc365bg"));
    }
    static int extractMaximum(String S)
    {
        String temp = "";
        int max = -1;

        for(int i = 0;i<S.length();i++)
        {
            if(Character.isDigit(S.charAt(i)))
                temp = temp + S.charAt(i);
            else
            {
                if(temp != "")
                {
                    int num = Integer.parseInt(temp);
                    max = Math.max(num, max);
                    temp = "";
                }
            }
        }
        return temp != "" ? Math.max(Integer.parseInt(temp),max) : max;
    }
}
