package string.basic;

//Completed GFG - correct
public class SumOfNumbersInString
{
    public static void main(String[] args)
    {
        System.out.println(findSum("geeks4geeks"));
    }
    public static long findSum(String str)
    {
        long sum = 0;
        String temp = "";
        for(int i = 0;i<str.length();i++)
        {
            if(Character.isDigit(str.charAt(i)))
                temp = temp + str.charAt(i);
            else
            {
                if(temp != "") {
                    sum = sum + Integer.parseInt(temp);
                    temp = "";
                }
            }
        }
        return sum + (temp!= "" ? Integer.parseInt(temp):0);
    }
}
