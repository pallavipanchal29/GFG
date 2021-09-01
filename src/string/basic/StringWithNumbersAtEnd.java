package string.basic;

//Completed GFG - correct
public class StringWithNumbersAtEnd
{
    public static void main(String[] args)
    {
        System.out.println(isSame("00047519742156243264036"));
    }
    static int isSame(String str)
    {
        int n = str.length();

        // Traverse string from end and find the number
        // stored at the end.
        // x is used to store power of 10.
        int num = 0, x = 1, i = n - 1;
        for (i = n - 1; i >= 0; i--)
        {
            if (Character.isDigit(str.charAt(i)))
            {
                num = (str.charAt(i) - '0') * x + num;
                x = x * 10;
                //only calculate till length becomes greater than string length to avoid integer overflow issue
                if(num>=n)
                    return 0;
            }
            else
                break;
        }

        // Check if number is equal to string
        // length except that number's digits
        return num == i + 1 ? 1 : 0;
    }
}
