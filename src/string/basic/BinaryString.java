package string.basic;

//Completed GFG - correct
public class BinaryString
{
    public static void main(String[] args)
    {
        System.out.println(binarySubstring(4,"1111"));
    }
    public static int binarySubstring(int a, String str)
    {
       int c = 0;
       for(int i = 0;i<str.length();i++) {
           if (str.charAt(i) == '1')
               c++;
       }
       return (c * (c- 1))/2;
    }
}
