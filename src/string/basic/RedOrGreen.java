package string.basic;

//Completed GFG - correct
public class RedOrGreen
{
    public static void main(String[] args)
    {
        System.out.println(RedOrGreen(5,"RGRGR"));
    }
    static int RedOrGreen(int N, String S)
    {
        int red = 0;
        int green = 0;
        for(int i = 0;i<N;i++)
        {
            if(S.charAt(i) =='R')
                red++;
            else  if(S.charAt(i) == 'G')
                green++;
        }
        return Math.min(red,green);
    }
}
