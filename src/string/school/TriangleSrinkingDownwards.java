package string.school;

//Completed GFG - correct
public class TriangleSrinkingDownwards
{
    public static void main(String[] args)
    {
        System.out.println(triDownwards("Geeks"));
    }
    static String triDownwards(String S)
    {
        StringBuilder answer = new StringBuilder();
        for(int i = 0;i<S.length();i++)
        {
            for(int j = 0;j<S.length();j++)
            {
                if(j < i)
                    answer.append(".");
                else
                    answer.append(S.charAt(j));
            }
        }
        return answer.toString();
    }
}
