package string.school;

public class ConvertListCharsString
{
    public static void main(String[] args)
    {
        char[] temp = new char[]{'g', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'g', 'e', 'e', 'k', 's'};
        System.out.println(chartostr(temp,13));
    }
    public static String chartostr(char arr[], int N)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<N;i++)
            sb.append(arr[i]);
        return sb.toString();
    }
}
