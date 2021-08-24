package string.school;

public class ReversingtheVowels
{
    public static void main(String[] args)
    {
        System.out.println(modify("practice"));
    }
    static String modify (String s)
    {
        char[] temp = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        while (i<j)
        {
            while (!isVowel(temp[i]))
                i++;
            while (!isVowel(temp[j]))
                j--;

            char t = temp[i];
            temp[i] = temp[j];
            temp[j] = t;
            i++;
            j--;
        }
        return String.valueOf(temp);
    }

    private static boolean isVowel(char c)
    {
        return (c == 'a' || c =='e' || c=='i' || c=='o' || c=='u');
    }
}
