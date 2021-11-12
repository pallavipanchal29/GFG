package string.basic;

//Completed GFG - correct
public class RockPaperScissors
{
    public static void main(String[] args)
    {
        System.out.println(gameResult("RS"));
    }
    static String gameResult(String s)
    {
        Character A = s.charAt(0);
        Character B = s.charAt(1);

        if(A == B)
            return "DRAW";
        if((A == 'R' && B == 'S') || (A == 'S' && B == 'P') || (A == 'P' && B == 'R'))
            return "A";
        else
            return "B";
    }
}
