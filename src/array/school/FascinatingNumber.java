package array.school;

//Completed GFG - correct
public class FascinatingNumber
{
    public static void main(String[] args)
    {
        System.out.println(fascinating("192"));
    }
    static boolean fascinating(String num)
    {
        if(num.length() > 9)
            return false;
        int n = Integer.valueOf(num);
        String number = num + n * 2 + n *3;
        int[] freq = new int[9];
        if(number.length() > 9)
            return false;

        for(int i = 0;i<number.length();i++)
        {
            int t = number.charAt(i) - '0';
            freq[t-1]++;
        }
        for(int i = 0;i<freq.length;i++)
        {
            if(freq[i] != 1)
                return false;
        }
        return true;
    }
}
