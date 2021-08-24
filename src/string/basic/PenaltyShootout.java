package string.basic;

public class PenaltyShootout
{
    public static void main(String[] args)
    {
        System.out.println(penaltyScore("1012012112110"));
    }
    public static int penaltyScore(String S)
    {
        int score = 0;
        int i = 0;
        if(S.length() == 0) return score;
        while (i < S.length())
        {
            if(S.charAt(i) == '2')
            {
                if(i+1 == S.length())
                    break;
                char c = S.charAt(i+1);
                if(c == '1')
                    score++;
                if(c == '1' || c == '0')
                    i = i+2;
                else
                    i++;
            }
            else
                i++;
        }
        return score;
    }
}
