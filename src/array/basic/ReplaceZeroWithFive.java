package array.basic;

//Completed GFG - correct
public class ReplaceZeroWithFive
{
    public static void main(String[] args)
    {
        int num = 1004;
        System.out.println(convertfive(num));
    }
    static int convertfive(int num)
    {
        char[] number = String.valueOf(num).toCharArray();
        for(int i = 0;i<number.length;i++)
        {
            if(number[i] == '0')
            {
                number[i] = '5';
            }
        }
        return Integer.valueOf(String.valueOf(number));
    }
}
